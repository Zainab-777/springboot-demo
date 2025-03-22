package com.example.demo.RestController;

import com.example.demo.Model.user;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("getUsers")
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }
    @PostMapping("/createUser")
    public user createUser(@RequestBody user usert) {
        return userRepository.save(usert);
    }
}
