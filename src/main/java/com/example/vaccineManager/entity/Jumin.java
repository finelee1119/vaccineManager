package com.example.vaccineManager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Jumin {
    @Id
    @Column(length = 20)
    private String jumin;

    @Column(length = 15)
    private String name;

    @Column(length = 15)
    private String phone;

    @Column(length = 50)
    private String address;
}
