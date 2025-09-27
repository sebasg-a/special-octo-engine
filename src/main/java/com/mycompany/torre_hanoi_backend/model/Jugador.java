package com.mycompany.torre_hanoi_backend.model;

import jakarta.persistence.*;
import java.time.Duration;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJugador;

    private String nombre;

    private int numeroMovimientos;
    private int numeroFichas;
    private Duration tiempoJugado;
    

    // Getters y Setters
    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duration getTiempoJugado() {
        return tiempoJugado;
    }

    public void setTiempoJugado(Duration tiempoJugado) {
        this.tiempoJugado = tiempoJugado;
    }

    public int getNumeroMovimientos() {
        return numeroMovimientos;
    }

    public void setNumeroMovimientos(int numeroMovimientos) {
        this.numeroMovimientos = numeroMovimientos;
    }

    public int getNumeroFichas() {
        return numeroFichas;
    }

    public void setNumeroFichas(int numeroFichas) {
        this.numeroFichas = numeroFichas;
    }

    }
