package com.example.restservice.infrastracture;

import org.springframework.stereotype.Component;

@Component
public class RepositoryDB implements IRepository{

    public RepositoryDB() {
    }

    @Override
    public String getObject(String name) {
        return "Dott. "+name;
    }
}
