package com.example.vaccineManager.mapper;

import com.example.vaccineManager.dto.HospitalDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HospitalMapper {
    HospitalDto findByHospCode(@Param("hospCode") String hospCode);
}
