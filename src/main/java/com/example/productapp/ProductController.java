package com.example.productapp;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.security.Principal;



@Controller

public class ProductController {

    @Autowired ProductService productService;

    @GetMapping(path = "/products")
    public String getProducts(Principal principal, Model model)
    {
        model.addAttribute("principal",principal);
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }

}
