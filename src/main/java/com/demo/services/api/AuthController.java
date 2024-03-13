package com.demo.services.api;

import com.demo.services.model.Status;
import com.demo.services.services.FirebaseStorage;
import com.demo.services.services.Services;
import com.demo.services.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "test/api")
@AllArgsConstructor
public class AuthController {

    @Autowired
    private Services services;

    @GetMapping
    public Status loginUser() {
        Status obj = new Status();

        Services.multithreading();

        obj.setLogged_in(true);
        obj.setToken("Temp Message");

        return obj;
    }

    @PostMapping
    public Status users(@RequestBody MultipartFile file) {

        FirebaseStorage firebaseStoreage= new FirebaseStorage();
        storageMethod(firebaseStoreage, file);

        Status obj = new Status();

        Services.multithreading();

        obj.setLogged_in(true);
        obj.setToken("File Successfully Uploaded");
        return obj;
    }

    public void storageMethod (StorageService storageService, MultipartFile file) {
        storageService.store(file);
    }
}
