package org.exmaple.controller;

import org.exmaple.model.dto.PostDTO;
import org.exmaple.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/post")
public class PostConstroller {

    @Autowired
    PostService postService;

    @GetMapping
    public List<PostDTO> getAll(){
        return postService.getAll();
    }
}
