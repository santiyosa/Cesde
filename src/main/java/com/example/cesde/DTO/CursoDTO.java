package com.example.cesde.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "cursos")
public class CursoDTO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(name = "descripcion", nullable = false, unique = true)
    private String descripcion;

    @Column(name = "duracion", nullable = false, unique = true)
    private int duracion;  // Documentado en semana

    @Column(name = "precio", nullable = false, unique = true)
    private BigDecimal precio;

    @Column(name = "fechaInicio", nullable = false, unique = true)
    private LocalDateTime fechaInicio;

    @Column(name = "docente", nullable = false, unique = true)
    private Long docente; 
}
