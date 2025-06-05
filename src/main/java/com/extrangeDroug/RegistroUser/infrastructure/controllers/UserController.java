package com.extrangeDroug.RegistroUser.infrastructure.controllers;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.extrangeDroug.RegistroUser.application.services.UserService;
import com.extrangeDroug.RegistroUser.domain.models.User;
import com.extrangeDroug.RegistroUser.infrastructure.mappers.UserMapper;


@RestController
@RequestMapping("/api/registro")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody Map<String, Object> userMap){
        User user = UserMapper.toModel(userMap);
        User created = userService.createUser(user);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }
}
