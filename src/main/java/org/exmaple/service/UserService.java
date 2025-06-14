package org.exmaple.service;

import org.exmaple.model.dto.UserDTO;
import org.exmaple.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Boolean validateCredentials(UserDTO userDTO){
        return true;
    }
}
