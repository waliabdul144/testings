package com.service.auth.Services;


import com.service.auth.Entity.Response;
import com.service.auth.Entity.User;
import com.service.auth.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@RequiredArgsConstructor
public class AuthService {

    private UserRepo userRepo;

    @Autowired
    public AuthService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Response createUser(String email, String password) {
        User user = userRepo.save(new User(email, password));
        return new Response("token", user.getUserID());
    }

    public Response fetchUser(String userID, String password) {
        User user = userRepo.getUserByUserIDAndPassword(userID, password);
        return new Response("token", user.getUserID());
    }
}