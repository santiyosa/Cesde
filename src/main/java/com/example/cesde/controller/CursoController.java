package com.example.cesde.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cesde.DTO.CursoDTO;
import com.example.cesde.service.CursoService;

@RestController
@RequestMapping("api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("")
    public List<CursoDTO> getUsers() {
        return cursoService.getCursoDTO();
    }

@GetMapping("/{id}")
    public ResponseEntity<CursoDTO> getUser(@PathVariable Long id) {
        CursoDTO cursoDTO = cursoService.geCursoDTOById(id);

        if (cursoDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CursoDTO>(cursoDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoDTO> getUser(@PathVariable Long id) {
        CursoDTO cursoDTO = cursoService.geCursoDTOById(id);

        if (cursoDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CursoDTO>(cursoDTO, HttpStatus.OK);
    }


    
}
