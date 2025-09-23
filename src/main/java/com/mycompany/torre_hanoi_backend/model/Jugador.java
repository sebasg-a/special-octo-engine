package com.mycompany.torre_hanoi_backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @CreationTimestamp
    private LocalDateTime fechaRegistro;

    @Column(name = "num_fichas")  // ← aquí indicamos que en la DB la columna se llama num_fichas
    private Integer numFichas;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public Integer getNumFichas() { return numFichas; }
    public void setNumFichas(Integer numFichas) { this.numFichas = numFichas; }
}
