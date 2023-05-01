package com.example.springscope.controllers;

import com.example.springscope.services.BasketService;
import com.example.springscope.services.BasketServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/order/")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("add")
    public String add(@RequestParam(required = false) List<Integer> item){
        return (basketService.addToBasket(item))?("Added:" + item.toString()):"Something went wrong! Couldn't add id to the basket.";
    }

    @GetMapping("get")
    public Map<Integer, Integer> get() {
        return basketService.getIdsFromBasket();
    }

}
