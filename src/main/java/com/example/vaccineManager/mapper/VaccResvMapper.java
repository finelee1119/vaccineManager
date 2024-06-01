package com.example.vaccineManager.mapper;

import com.example.vaccineManager.dto.VaccResvDto;
import com.example.vaccineManager.dto.VaccResvStatusDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VaccResvMapper {
    void save(@Param("vaccResvDto") VaccResvDto vaccResvDto);

    VaccResvDto searchByKeyword(@Param("keyword") String keyword);


    List<VaccResvStatusDto> getReservationStatus();
}
