package com.example.cesde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cesde.DTO.DocenteDTO;

@Repository
public interface DocenteRepository extends JpaRepository<DocenteDTO, Long>{
    
}
