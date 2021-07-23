package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.model.Authorities;
import ru.netology.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public String getAuthorities(@RequestParam("user") String user,
                                            @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

}
