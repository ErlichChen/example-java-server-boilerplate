package com.ccc.example.controller;

import com.ccc.example.bean.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @PostMapping("/login")
    public String loginHandler(UserInfo userInfo, Model model) {
        model.addAttribute("UserInfo", userInfo);
        return "/jsp/welcome";
    }
}
