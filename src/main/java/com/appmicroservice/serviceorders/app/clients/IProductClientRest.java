package com.appmicroservice.serviceorders.app.clients;

import com.appmicroservice.serviceorders.app.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;

@FeignClient(name = "service-products", url="localhost:8081")
public interface IProductClientRest {

    @GetMapping("product")
    public List<Product> list();

    @GetMapping("product/{id}")
    public Product details(@PathVariable Long id);

}
