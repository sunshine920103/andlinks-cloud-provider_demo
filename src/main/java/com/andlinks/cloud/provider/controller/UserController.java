package com.andlinks.cloud.provider.controller;

import com.andlinks.cloud.provider.entity.User;
import com.andlinks.cloud.provider.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.getOne(id);
        return findOne;
    }

    @GetMapping("/getUser")
    public User findByIdAndUsername(@RequestParam Long id,@RequestParam String username ){
        User user=userRepository.findByIdAndUsername(id,username);
        return  user;
    }

    @GetMapping("getByMap")
    public User findByIdAndUsername(@RequestParam Map<String,String> map ){
        User user=userRepository.findByIdAndUsername(Long.valueOf(map.get("id")),map.get("username"));
        return  user;
    }

    @PostMapping("/postUser")
    public User postUser(@RequestBody User user){
        return user;
    }
}
