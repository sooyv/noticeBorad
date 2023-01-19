package com.example.notice_board.repositroy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class PostRepository {

    private final EntityManager em;
//
//    public void savePost(Post post) {
//        if ()
//    }
}
