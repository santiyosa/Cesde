package com.example.cesde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cesde.DTO.CursoDTO;

@Repository
public interface CursoRepository extends JpaRepository<CursoDTO, Long> {
    
}
