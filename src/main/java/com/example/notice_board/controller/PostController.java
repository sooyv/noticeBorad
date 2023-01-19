package com.example.notice_board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PostController {

    @GetMapping("new/post")
    public String createPost() {

        return "post/createForm";
    }
}
