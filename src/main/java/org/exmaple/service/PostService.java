package org.exmaple.service;

import org.exmaple.model.dto.PostDTO;
import org.exmaple.model.entity.PostEntity;
import org.exmaple.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    ModelMapper modelMapper = new ModelMapper();

    public List<PostDTO> getAll(){
        List<PostEntity> postEntityList = postRepository.findAll();
        List<PostDTO> postDTOList = new ArrayList<>();

        postEntityList.forEach(postEntity -> {
            postDTOList.add(modelMapper.map(postEntity, PostDTO.class));

            /*PostDTO postDTO = new PostDTO();
            postDTO.setId(postEntity.getId());
            postDTO.setTitle(postEntity.getTitle());
            postDTO.setContent(postEntity.getContent());
            postDTO.setTags(postEntity.getTags());
            postDTO.setCategory(postEntity.getCategory());
            postDTO.setCommentsCount(postEntity.getCommentsCount());
            postDTO.setCreatedAt(postEntity.getCreatedAt());
            postDTO.setUpdatedAt(postEntity.getUpdatedAt());
            postDTO.setImageUrl(postEntity.getImageUrl());
            postDTOList.add(postDTO);*/
        });
        return postDTOList;
    }
}
