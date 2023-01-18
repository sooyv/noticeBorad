package com.example.notice_board.service;

import com.example.notice_board.controller.UserController;
import com.example.notice_board.domain.User;
import com.example.notice_board.repositroy.UserRepostitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepostitory userRepostitory;

    @Transactional
    public Long createUser(User user) {
        System.out.println("service");
        userRepostitory.save(user);
//        System.out.println(user);

        return user.getUserId();



    }
//    @Transactional
//    public Long createUser(UserForm form) {
//        User user = new User();
//        user.setUserID(form.getUserID());
//        user.setPassword(form.getPassword1());
//        user.setEmail(form.getEmail());
//        userRepostitory.save(user);
//        return user.getUser_id();
//    }
}
