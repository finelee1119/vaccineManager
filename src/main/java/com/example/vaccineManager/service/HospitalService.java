package com.example.vaccineManager.service;

import com.example.vaccineManager.dto.HospitalDto;
import com.example.vaccineManager.mapper.HospitalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
    @Autowired
    HospitalMapper hospitalMapper;

    public HospitalDto findByHospCode(String hostCode) {
        return hospitalMapper.findByHospCode(hostCode);
    }
}
