package com.paulo.mongoWorkshop.dto;

import com.paulo.mongoWorkshop.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO(){
    }

    public AuthorDTO(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
    }
}
