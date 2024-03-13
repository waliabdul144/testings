package com.demo.services.model;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
public class UploadFile {
    private File fileUpload;
    private String userId;

    public UploadFile(File fileUpload, String userId) {
        this.fileUpload = fileUpload;
        this.userId = userId;
    }
}
