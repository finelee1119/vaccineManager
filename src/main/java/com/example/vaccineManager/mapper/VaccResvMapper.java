package com.example.vaccineManager.mapper;

import com.example.vaccineManager.dto.VaccResvDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VaccResvMapper {
    void save(@Param("vaccResvDto") VaccResvDto vaccResvDto);
}
