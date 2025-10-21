package com.paulo.mongoWorkshop.services;

import com.paulo.mongoWorkshop.domain.User;
import com.paulo.mongoWorkshop.dto.UserDTO;
import com.paulo.mongoWorkshop.services.exception.ObjectNotFoundException;
import com.paulo.mongoWorkshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj) {
        return repo.save(obj);
    }

    public User fromDTO(UserDTO objDTO) {
        return new User(objDTO.getId(),objDTO.getName(), objDTO.getEmail());
    }
}
