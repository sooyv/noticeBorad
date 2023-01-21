package com.example.notice_board.controller.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter @Setter
public class UserForm {
    @Size(min = 3, max = 10)
    @NotEmpty(message = "사용자 ID를 입력해주세요")
    private String userNickName;

    @NotEmpty(message = "비밀번호를 입력해주세요")
    private String password;

    @NotEmpty(message = "이메일을 입력해주세요")
    @Email
    private String email;

}
