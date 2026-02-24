package com.template.repository;

import com.template.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {
    @PersistenceContext
    private EntityManager em;


    public Optional<User> findByUsername(String username) {
        return null;
    }
}
