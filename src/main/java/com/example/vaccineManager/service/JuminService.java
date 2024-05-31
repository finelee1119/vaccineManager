package com.example.vaccineManager.service;

import com.example.vaccineManager.dto.JuminDto;
import com.example.vaccineManager.mapper.JuminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuminService {
    @Autowired
    JuminMapper juminMapper;

    public JuminDto findByJumin(String jumin) {
        return juminMapper.findByJumin(jumin);
    }
}
