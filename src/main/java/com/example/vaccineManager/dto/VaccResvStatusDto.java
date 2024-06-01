package com.example.vaccineManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccResvStatusDto {
    private String hospitalRegion;
    private String hospitalRegionName;
    private int reservationCount;
}
