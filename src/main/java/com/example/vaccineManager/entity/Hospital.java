package com.example.vaccineManager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Hospital {
    @Id
    @Column(length = 4)
    private String hostCode;

    @Column(length = 40)
    private String hostName;

    @Column(length = 15)
    private String hostTel;

    @Column(length = 2)
    private String hostAddr;
}
