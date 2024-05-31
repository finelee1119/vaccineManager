package com.example.vaccineManager.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "vaccresv")
public class VaccResv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resv_no")
    private Long resvNo; //예약번호
    @Column(name = "jumin", length = 20)
    private String jumin; //주민번호
    @Column(name = "hosp_code", length = 4)
    private String hospCode; //병원코드
    @Column(name = "resv_date")
    private LocalDate resvDate; //예약날짜
    @Column(name = "resv_time", length = 4)
    private String resvTime; //예약시간
    @Column(name = "v_code", length = 4)
    private String vCode; //백신코드
}
