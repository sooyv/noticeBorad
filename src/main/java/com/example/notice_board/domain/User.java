package com.example.notice_board.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
    private Long userId;

    @Column(unique = true)  // nuique로 유일한 값만 저장할 수 있도록. 중복된 값 저장 불가
    private String userNickName;

    @Column
    private String password;

    @Column(unique = true)
    private String email;
}
