package com.paulo.mongoWorkshop.repository;

import com.paulo.mongoWorkshop.domain.Post;
import com.paulo.mongoWorkshop.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
