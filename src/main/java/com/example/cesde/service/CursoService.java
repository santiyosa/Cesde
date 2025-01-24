package com.example.cesde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cesde.DTO.CursoDTO;
import com.example.cesde.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<CursoDTO> getCursoDTO() {
        return cursoRepository.findAll();
    }

    public CursoDTO geCursoDTOById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    
    
}
