package com.example.vaccineManager.mapper;

import com.example.vaccineManager.dto.JuminDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JuminMapper {
    JuminDto findByJumin(@Param("jumin") String jumin);
}
