package org.exmaple.controller;

import org.exmaple.model.dto.UserDTO;
import org.exmaple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public Boolean validateCredentials(@RequestBody UserDTO userDTO){
        return userService.validateCredentials(userDTO);
    }
}
