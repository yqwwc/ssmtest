package com.chenwei.ssmtest.controller;

import com.chenwei.ssmtest.model.User;
import com.chenwei.ssmtest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login")
    public String login() {
        System.out.println("进来了");
        User user = new User();
        user.setStu_num("1606390234");
        user.setStu_pwd("123456");
        try {
            int count = loginService.login(user);
            if (count >= 1) {
                System.out.println("登录成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/login";
    }
}