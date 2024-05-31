package com.example.vaccineManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDto {
    private String hospCode;
    private String hospName;
    private String hospTel;
    private String hospAddr;
}
