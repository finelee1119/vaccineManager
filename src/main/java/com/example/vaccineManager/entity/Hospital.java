package com.example.vaccineManager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Hospital {
    @Id
    @Column(name = "hosp_code")
    private String hospCode;
    @Column(name = "hosp_name")
    private String hospName;
    @Column(name = "hosp_tel")
    private String hospTel;
    @Column(name = "hosp_addr")
    private String hospAddr;
}
