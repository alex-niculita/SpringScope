package com.example.springscope.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BasketService {
    boolean addToBasket(List<Integer> items);
    Map<Integer, Integer> getIdsFromBasket();
}
