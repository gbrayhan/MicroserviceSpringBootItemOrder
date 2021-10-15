package com.appmicroservice.serviceorders.app.controllers;

import com.appmicroservice.serviceorders.app.ItemOrder;
import com.appmicroservice.serviceorders.app.services.IItemOrderService;
import com.appmicroservice.serviceorders.app.services.ItemOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemOrderController {

    @Autowired
    @Qualifier("ItemOrderFeignService")
    private IItemOrderService itemOrderService;

    @GetMapping("/item-order")
    public List<ItemOrder> list(){
        return itemOrderService.findAll();
    }

    @GetMapping("/item-order/{id}/{quantity}")
    public ItemOrder detail(@PathVariable Long id, @PathVariable Integer quantity) {
        return itemOrderService.findById(id,quantity);
    }

}
