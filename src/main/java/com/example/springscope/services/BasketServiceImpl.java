package com.example.springscope.services;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService{

    private Map<Integer, Integer> basket = new HashMap<>();

    @Override
    public boolean addToBasket(List<Integer> items) {
        if (items == null) return false;

        for (Integer item:items) {
            if (basket.containsKey(item)) {
                int v = basket.get(item);
                basket.put(item,++v);
            } else {
                basket.put(item,1);
            }
        }
        return true;
    }

    @Override
    public Map<Integer, Integer> getIdsFromBasket() {
        return basket;
    }
}
