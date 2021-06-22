package com.ghp.demogithub.controller;

import com.ghp.demogithub.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: GHP
 * @time: 2021/6/22 13:12
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public Object getUser() {
    return new User("1001","张三");
    }

    @RequestMapping("/userCC")
    public Object getUserCC() {
        return new User("1001","CC");
    }

}
