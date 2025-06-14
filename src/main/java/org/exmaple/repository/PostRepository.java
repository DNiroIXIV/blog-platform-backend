package org.exmaple.repository;

import org.exmaple.model.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
