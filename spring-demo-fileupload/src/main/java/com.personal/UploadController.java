package com.personal;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by mac on 05/07/2017.
 */
@Controller
public class UploadController {

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("/home/zhiyong/workspace/" + file.getOriginalFilename()), file.getBytes());
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }
}
