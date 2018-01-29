package com.infonova.paybox.securerestapi.controller;

import com.infonova.paybox.securerestapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class SecuredKeycloakController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers")
    public String getProducts(Model model){
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
