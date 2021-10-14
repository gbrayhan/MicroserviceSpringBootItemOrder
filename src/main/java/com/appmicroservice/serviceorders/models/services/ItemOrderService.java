package com.appmicroservice.serviceorders.models.services;

import com.appmicroservice.serviceorders.models.ItemOrder;
import com.appmicroservice.serviceorders.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemOrderService implements IItemOrderService{
    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<ItemOrder> findAll() {
        List<Product> products = Arrays.asList(clientRest.getForObject("http://localhost:8081/product",Product[].class));

        return products.stream().map(prod -> new ItemOrder(prod ,1 )).collect(Collectors.toList());
    }

    @Override
    public ItemOrder findById(Long id, Integer quantity) {
        Map<String,String> pathVariables = new HashMap<String, String>();
        pathVariables.put("id", id.toString());
        Product product = clientRest.getForObject("http://localhost:8081/product/{id}", Product.class,pathVariables );

        return new ItemOrder(product, quantity);
    }

}
