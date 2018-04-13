package com.afikur.controller;

import com.afikur.model.User;
import com.afikur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/users"})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value={"create"}, method = RequestMethod.GET)
    public String createUser(@ModelAttribute("user") User user) {
        return "createUser";
    }

    @RequestMapping(value={"create"}, method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "createUser";
    }
}
