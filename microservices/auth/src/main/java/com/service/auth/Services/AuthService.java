package com.service.auth.Services;


import com.service.auth.Entity.Response;
import com.service.auth.Entity.User;
import com.service.auth.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Component
@RequiredArgsConstructor
public class AuthService {

    @Autowired
    private UserRepo userRepo;

    public Response signUp(User user) {
        User existingUser = userRepo.findByEmail(user.getEmail());

        if (existingUser != null) {
            return new Response(null, null, 400);
        }

        userRepo.save(user);

        return new Response("TRUE_TOKEN", user.getUserID());
    }

    public User getUserByID(String userID, String jwtToken) {

        return userRepo.findByUserID(userID);
    }

    public boolean updateUser(String userID, User newUser, String jwtToken, String csrfToken) {



        Optional<User> user = userRepo.findById(newUser.getUserID());

        String encryptedPass = encrypt.encrypt(newUser.getPassword(), "secret");

        user.ifPresent(user1 -> {
            user1.setName(newUser.getName());
            user1.setEmail(newUser.getEmail());
            user1.setPassword(encryptedPass);
        });

        userRepo.save(user.get());
        return true;
    }

    public Response loginUser(String email, String password) {
        String encryptedPass = encrypt.encrypt(password, "secret");

        User user = userRepo.findByEmailAndPassword(email, encryptedPass);

        if (user != null) {
            return new Response(jwt.generateToken(email), user.getUserID(), 200);
        }

        return new Response(null, null, 404);
    }


}