package com.appmicroservice.serviceorders.app.services;

import com.appmicroservice.serviceorders.app.ItemOrder;
import com.appmicroservice.serviceorders.app.clients.IProductClientRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("ItemOrderFeignService")
@Primary
public class ItemOrderFeignService implements IItemOrderService {
    @Autowired
    private IProductClientRest  clientFeign;

    @Override
    public List<ItemOrder> findAll() {
        // TODO Auto-generated method stub
        return clientFeign.list().stream().map(p -> new ItemOrder(p,1)).collect(Collectors.toList());
    }

    @Override
    public ItemOrder findById(Long id, Integer quantity) {
        return new ItemOrder(clientFeign.details(id), quantity );
    }
}
