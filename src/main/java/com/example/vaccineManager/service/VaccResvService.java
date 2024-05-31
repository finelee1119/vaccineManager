package com.example.vaccineManager.service;

import com.example.vaccineManager.dto.VaccResvDto;
import com.example.vaccineManager.mapper.VaccResvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccResvService {

    @Autowired
    VaccResvMapper vaccResvMapper;

    //백신예약 등록
    public void save(VaccResvDto vaccResvDto) {
        vaccResvMapper.save(vaccResvDto);
    }

    //백신예약 조회(조건부)
    public VaccResvDto searchByKeyword(String keyword) {
        return vaccResvMapper.searchByKeyword(keyword);
    }
}
