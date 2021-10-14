package com.appmicroservice.serviceorders.models;

public class ItemOrder {
    public ItemOrder() {
    }

    public ItemOrder(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private Product product;
    private Integer quantity;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {

        return product.getPrice() * quantity.doubleValue();
    }

}
