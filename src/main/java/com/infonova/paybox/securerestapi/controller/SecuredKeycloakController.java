package com.infonova.paybox.securerestapi.controller;

import com.infonova.paybox.securerestapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@Controller
public class SecuredKeycloakController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers")
    public String getCustomers(Model model){
        model.addAttribute("customers", customerService.getCustomers());
        return "customers";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }

    @GetMapping(path = "/customers/manage")
    public String getManagementPage(Model model){
        model.addAttribute("customers", customerService.getCustomers());
        return "management";
    }

    @DeleteMapping(path = "/customers/manage/{id}")
    public String deleteCustomer(Model model, @PathVariable("id") Long id){
        List customers = customerService.getCustomers();
        model.addAttribute("customers", customers.remove(id));
        return "management";
    }
}
