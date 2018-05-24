package com.example.productapp;

import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductService {
    public List<String> getProducts() {
        return Arrays.asList("iPad","iPod","iPhone");
    }
}
