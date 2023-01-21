package com.example.notice_board.controller;

import com.example.notice_board.domain.User;
import com.example.notice_board.controller.form.UserForm;
import com.example.notice_board.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    // final 이 없으면 계속 새로운 userService 생성
    // final 상수, userService는 계속 바뀔 이유가 없는 애.
    private final UserService userService;

    @GetMapping("/user/signUp")
    public String signUpForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "user/signUpForm";
    }

    @PostMapping("/user/signUp")
    public String signUp(@Valid UserForm userForm) {
//        if (result.hasErrors()) {
//            return "/signUpForm";
//        }

        User user = new User();
        user.setUserNickName(userForm.getUserNickName());
        user.setPassword(userForm.getPassword());
        user.setEmail(userForm.getEmail());

        System.out.println(user.getUserId());
        System.out.println(user.getUserNickName());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
//        System.out.println("컨트롤러");
//        System.out.println(user.getUserId()); // nullpointer

        userService.createUser(user);

        return "redirect:/";
    }

    @GetMapping("/user/login")
    public String login() {

        return "/user/login";
    }
}
