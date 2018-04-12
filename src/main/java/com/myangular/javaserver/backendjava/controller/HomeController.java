package com.myangular.javaserver.backendjava.controller;

import com.myangular.javaserver.backendjava.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@RestController
public class HomeController {

    Product[] product = new Product[]
            {new Product(0, "First Product", 24.99, 4.3f, "This is a short description of the First Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", new String[]{"electronics", "hardware"}),
                    new Product(1, "Second Product", 24.99, 4.3f, "This is a short description of the First Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", new String[]{"electronics", "hardware"})
            };


    @GetMapping("/getProducts")
    public Product[] getProducts(HttpServletResponse httpServletResponse) {
        httpServletResponse.addHeader("Access-Control-Allow-Origin" , "*");
        return this.product;
    }
    @GetMapping("/getProductById")
    public Product getProductById(@RequestParam Integer id , HttpServletResponse httpServletResponse) {
        httpServletResponse.addHeader("Access-Control-Allow-Origin" , "*");
        return this.product[id];
    }
}
