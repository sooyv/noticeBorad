package com.example.notice_board.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class homeContrlloer {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
