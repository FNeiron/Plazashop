package com.plaza.spring.springboot.plazashop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Entity
@Table(name= "roles")
@Getter @Setter
public class Role implements Serializable {
    @Id
    @Column(name = "article")
    private int article;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user_id;

    @Column(name = "role")
    private String role;
}
