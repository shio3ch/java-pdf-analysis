package site.shio3ch.panshopapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import site.shio3ch.panshopapp.domain.service.UsersService;

@Controller
public class IndexController {

    @Autowired
    private UsersService service;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("userList", service.getAllUsers());
        return "index";
    }
}
