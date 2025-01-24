package com.example.cesde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cesde.DTO.DocenteDTO;
import com.example.cesde.repository.DocenteRepository;

@Service
public class DocenteService {
    
        @Autowired
    private DocenteRepository docenteRepository;

    public List<DocenteDTO> getDocenteDTO() {
        return docenteRepository.findAll();
    }
}
