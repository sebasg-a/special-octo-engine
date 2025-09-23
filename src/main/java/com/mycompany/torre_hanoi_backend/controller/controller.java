package com.mycompany.torre_hanoi_backend.controller;

import com.mycompany.torre_hanoi_backend.model.Jugador;
import com.mycompany.torre_hanoi_backend.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class controller {

    @Autowired
    private JugadorRepository jugadorRepository;

    // Listar todos los jugadores
    @GetMapping
    public List<Jugador> getAllJugadores() {
        return jugadorRepository.findAll();
    }

    // Crear jugador
    @PostMapping
    public Jugador createJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
}
