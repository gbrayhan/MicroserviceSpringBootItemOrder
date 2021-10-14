package com.appmicroservice.serviceorders.models.services;

import com.appmicroservice.serviceorders.models.ItemOrder;

import java.util.List;

public interface IItemOrderService {
    public List<ItemOrder> findAll();
    public ItemOrder findById(Long id, Integer quantity);
}
