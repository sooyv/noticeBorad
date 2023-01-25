package com.example.notice_board.controller;

import com.example.notice_board.controller.form.PostForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PostController {

    @GetMapping("/create/post")
    public String createPost(Model model) {
        model.addAttribute("postForm", new PostForm());
        return "post/createPost";
    }



}
