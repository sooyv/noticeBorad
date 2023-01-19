package com.example.notice_board.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;

    @Column(length = 200) // 200으로 제목 수 제한
    private String title;

    private String content;
    private LocalDateTime createDate;
//    private LocalDateTime modifiyDate;

    // 연관관계 설정
    // 게시글 - 댓글은 1 : N 관계
}
