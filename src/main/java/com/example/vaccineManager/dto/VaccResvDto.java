package com.example.vaccineManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccResvDto {
    private Long resvNo; //예약번호
    private String jumin; //주민번호
    private String hospCode; //병원코드
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate resvDate; //예약날짜
    private LocalDateTime resvTime; //예약시간
    private String vCode; //백신코드
}
