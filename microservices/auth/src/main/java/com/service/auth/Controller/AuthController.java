package com.service.auth.Controller;

import com.service.auth.Entity.JwtRequest;
import com.service.auth.Entity.Response;
import com.service.auth.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService usersService;

    @Autowired
    public AuthController(AuthService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public Response fetchUser(@RequestBody JwtRequest request) {
        return usersService.fetchUser(request.getUser().getUserID(), request.getUser().getPassword());
    }

    @GetMapping("/test")
    public String test() {
        return "This method works fine";
    }


    @GetMapping("/sign-up")
    public Response createUser(@RequestBody JwtRequest request) {
        return usersService.createUser(request.getUser().getUserID(), request.getUser().getPassword());
    }


}
