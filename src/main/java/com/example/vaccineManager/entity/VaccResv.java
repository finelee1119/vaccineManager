package com.example.vaccineManager.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class VaccResv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resvNo; //예약번호

    @Column(length = 20)
    private String jumin; //주민번호

    @Column(length = 4)
    private String hospCode; //병원코드

    private LocalDate resvDate; //예약날짜

    @Column(length = 4)
    private LocalDateTime resvTime; //예약시간

    @Column(length = 4)
    private String vCode; //백신코드
}
