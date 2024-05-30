package com.example.vaccineManager.service;

import com.example.vaccineManager.dto.VaccResvDto;
import com.example.vaccineManager.entity.VaccResv;
import com.example.vaccineManager.mapper.VaccResvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccResvService {

    @Autowired
    VaccResvMapper vaccResvMapper;

    //백신예약(등록)
    public void save(VaccResvDto vaccResvDto) {
        vaccResvMapper.save(vaccResvDto);
    }
}
