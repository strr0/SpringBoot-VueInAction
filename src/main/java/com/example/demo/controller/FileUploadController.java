package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @GetMapping("/upload")
    public String getUploadPage() {
        return "upload";
    }
    @PostMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestPart("uploadFile") MultipartFile file) throws IOException {
        file.transferTo(new File(file.getOriginalFilename()));
        return "null";
    }
}
