package com.example.vaccineManager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Jumin {
    @Id
    private String jumin;
    private String name;
    private String phone;
    private String address;
}
