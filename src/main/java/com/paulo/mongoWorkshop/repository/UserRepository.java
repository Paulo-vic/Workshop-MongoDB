package com.paulo.mongoWorkshop.repository;

import com.paulo.mongoWorkshop.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
