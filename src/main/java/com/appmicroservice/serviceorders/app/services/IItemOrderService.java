package com.appmicroservice.serviceorders.app.services;

import com.appmicroservice.serviceorders.app.ItemOrder;

import java.util.List;

public interface IItemOrderService {
    public List<ItemOrder> findAll();
    public ItemOrder findById(Long id, Integer quantity);
}
