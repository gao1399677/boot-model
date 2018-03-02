package com.spring.boot.entity;

import java.io.Serializable;

public class CustomerId implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String brandCode;

    public CustomerId() {
    }

    public CustomerId(int id, String brandCode) {
        this.id = id;
        this.brandCode = brandCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandCode() {
        return this.brandCode;
    }

    @Override
    public String toString() {
        return "CustomerId{" +
                "id=" + id +
                ", brandCode='" + brandCode + '\'' +
                '}';
    }
}