package com.example.cesde.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cesde.DTO.DocenteDTO;
import com.example.cesde.service.DocenteService;

@RestController
@RequestMapping("api/docentes")
public class DocenteController {
    
        @Autowired
    private DocenteService docenteService;

    @GetMapping("")
    public List<DocenteDTO> getDocente() {
        return docenteService.getDocenteDTO();
    }
}
