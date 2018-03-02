package com.spring.boot.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@IdClass(CustomerId.class)
public class Customer {

    @Id
    private int id;
    @Id
    private String brandCode;

    private String company;
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<OrderDetail> orderDetails;

    public Customer() {
    }


    public Customer(int id, String brandCode, String company, String name) {
        this.id = id;
        this.brandCode = brandCode;
        this.company = company;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", brandCode='" + brandCode + '\'' +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", orderDetails=" + orderDetails +
                '}';
    }
}