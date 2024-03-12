package com.demo.services.api;

import com.demo.services.model.Status;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "test/api")
public class AuthController {

    @GetMapping
    public Status loginUser() {
        Status obj = new Status();

        obj.setLogged_in(true);
        obj.setToken("Temp Mesage");

        return obj;
    }
//
//    @GetMapping
//    public Status loginUser_() {
//        Status obj = new Status();
//
//        obj.setLogged_in(false);
//        obj.setToken("Temp Mesage");
//
//        return obj;
//    }
}
