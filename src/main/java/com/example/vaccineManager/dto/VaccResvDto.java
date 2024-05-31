package com.example.vaccineManager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccResvDto {
    private Long resvNo; //예약번호

    @NotBlank(message = "주민번호를 입력해주세요")
    private String jumin; //주민번호

    @NotBlank(message = "병원코드를 선택해주세요")
    private String hospCode; //병원코드

    @NotNull(message = "예약날짜를 입력해주세요")
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate resvDate; //예약날짜

    @NotNull(message = "예약시간을 입력해주세요")
//    @DateTimeFormat(pattern = "HHmm")
    private String resvTime; //예약시간

    @NotBlank(message = "백신코드를 선택해주세요")
    private String vCode; //백신코드
}
