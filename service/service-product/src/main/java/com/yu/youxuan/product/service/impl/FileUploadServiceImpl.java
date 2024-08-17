package com.yu.youxuan.product.service.impl;


import com.yu.youxuan.product.service.FileUploadService;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
@Slf4j
public class FileUploadServiceImpl implements FileUploadService {


    @Value("${minio.config.endpoint}")
    private String endpoint;

    @Value("${minio.config.accessKey}")
    private String accessKey;

    @Value("${minio.config.secretKey}")
    private String secretKey;

    @Value("${minio.config.url}")
    private String url;

    @Value("${minio.config.bucketName}")
    private String bucketName;

    //图片上传的方法
    @Override
    public String uploadFile(MultipartFile file) {
        MinioClient client =MinioClient.builder().endpoint(url).credentials(accessKey, secretKey).build();
        try {

            //获取文件实际名称
            String objectName = file.getOriginalFilename();
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            objectName = uuid + objectName;

            //对上传文件进行分组，根据当前年/月/日
            // objectName:  2023/10/10/uuid01.jpg
            String currentDateTime = new DateTime().toString("yyyy/MM/dd");
            objectName = currentDateTime + "/" + objectName;

            // 构建文件上传相关信息
            PutObjectArgs args = PutObjectArgs.builder()
                    .bucket(bucketName)
                    .object(objectName)
                    .stream(file.getInputStream(), file.getSize(), -1)
                    .contentType(file.getContentType())
                    .build();
            // 将文件上传到minio服务器
            client.putObject(args);
            log.info("文件上传成功");

            //返回上传图片路径
            String url2 = url + "/" + bucketName + "/" + objectName;
            return url2;
        } catch (Exception ce) {
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            //关闭client

        }
            return null;
        }
    }
