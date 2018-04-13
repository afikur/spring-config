package com.afikur.repository;

import com.afikur.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public User save(User user) {
         em.persist(user);
         em.flush();
         return user;
    }
}
