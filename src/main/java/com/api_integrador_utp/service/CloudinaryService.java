package com.api_integrador_utp.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CloudinaryService {

    Cloudinary cloudinary;

    private Map<String,String> valuesMap = new HashMap<>();

    @Value("${cloud.name}")
    String cloudName;
    @Value("${cloud.api.key}")
    String cloudApiKey;
    @Value("${cloud.api.secret}")
    String cloudApiSecret;

    public CloudinaryService(){
        valuesMap.put("cloud_name",cloudName);
        valuesMap.put("api_key",cloudApiKey);
        valuesMap.put("api_secret",cloudApiSecret);
        cloudinary = new Cloudinary(valuesMap);
    }


    public Map upload(MultipartFile multipartFile) throws IOException{
        File file = covert(multipartFile);
        Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        file.delete();
        return result;
    }

    public Map delete(String id) throws IOException{
        Map result = cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
        return result;
    }

    private File covert(MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(multipartFile.getBytes());
        fo.close();
        return file;
    }
}
