package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long client_id;
    private String order_list;
    private Date date;

    public Order() {
    }

    public Order(Long client_id, String order_list, Date date) {
        this.client_id = client_id;
        this.order_list = order_list;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public String getOrder_list() {
        return order_list;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public void setOrder_list(String order_list) {
        this.order_list = order_list;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "Order [id=" + id + ", client_id=" + client_id + ", order_list=" + order_list + ", date=" + date + "]";
    }
}
