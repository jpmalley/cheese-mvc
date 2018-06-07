package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    public String add(Model model) {
        return "user/add";
    }

    public String add(Model model, @ModelAttribute User user, String verify) {
        return "user/index";
    }

}
