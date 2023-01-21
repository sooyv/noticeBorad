package com.example.notice_board.repositroy;

import com.example.notice_board.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepostitory {
    @PersistenceContext
    private EntityManager em;

    public void save(User user) {
        em.persist(user);
    }
}
