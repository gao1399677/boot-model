package com.spring.boot.entity;

import javax.persistence.*;

@Entity
public class OrderDetail {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "customerBrandCode", referencedColumnName = "brandCode"),
            @JoinColumn(name = "customerId", referencedColumnName = "id")
    })
    private Customer customer;

    private String product;

    public OrderDetail() {
    }

    public OrderDetail(String id, String product, Customer customer) {
        this.id = id;
        this.product = product;
        this.customer = customer;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setProductName(String product) {
        this.product = product;
    }

    public String getProduct() {
        return this.product;
    }

    public String toString() {
        return String.format("['product': %s]", this.product);
    }
}