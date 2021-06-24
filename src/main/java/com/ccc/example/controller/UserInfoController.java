package com.ccc.example.controller;

import com.ccc.example.bean.UserInfo;
import com.ccc.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/register")
    public String registerHandler(UserInfo userInfo, Model model) {
        model.addAttribute("UserInfo", userInfo);
        userInfoService.create(userInfo);
        return "/jsp/welcome";
    }

    @PostMapping("/login")
    public String loginHandler(UserInfo userInfo, Model model) {
        model.addAttribute("UserInfo", userInfo);
        return "/jsp/welcome";
    }
}
