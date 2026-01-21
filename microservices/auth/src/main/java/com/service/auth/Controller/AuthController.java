package com.service.auth.Controller;

import com.service.auth.Services.AuthService;
import jakarta.security.auth.message.AuthStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService usersService;

    @Autowired
    public Auth(UsersService usersService) {
        this.usersService = usersService;
    }

    public AuthController(AuthService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public Response users(@RequestBody JwtRequest request) {
        return usersService.loginUser(request.getEmail(), request.getPassword());
    }

    @GetMapping("/public")
    public String publicRoute() {
        return "This is Public Screen";
    }

    @GetMapping("/private")
    public String privateRoute() {
        return "This is PRIVATE Screen";
    }

    @GetMapping("/toLogin")
    public String temp() {
        return "toLoginPage if Existed";
    }

    @GetMapping("/response")
    public ResponseEntity<String> res(){
        return ResponseEntity.ok("This is an OK Response");
    }

}
