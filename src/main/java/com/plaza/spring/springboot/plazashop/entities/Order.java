package com.plaza.spring.springboot.plazashop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int order_id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user_id;
    @Column(name = "address")
    private String address;
    @Column(name = "date")
    private LocalDate date;
    @OneToMany(mappedBy = "order_id", cascade = CascadeType.ALL)
    private List<Instance> instanceList;
    public Order(User user_id, String address, LocalDate date) {
        this.user_id = user_id;
        this.address = address;
        this.date = date;
    }
    public Order(User user_id, String address, LocalDate date, List<Instance> instanceList) {
        this.user_id = user_id;
        this.address = address;
        this.date = date;
        this.instanceList = instanceList;
        for (Instance inst:
             instanceList) {
            inst.setOrder_id(this);
        }
    }
    public Order() {

    }
}
