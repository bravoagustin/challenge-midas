package com.bravo.challenge.cobranzas.controller;

import com.bravo.challenge.cobranzas.model.Comision;
import com.bravo.challenge.cobranzas.service.ComisionesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ComisionesController {

    private final ComisionesService comisionesService;

    public ComisionesController(ComisionesService comisionesService) {
        this.comisionesService = comisionesService;
    }

    @GetMapping("/mis-comisiones")
    public ResponseEntity<Comision> misComisiones(@RequestParam String username) {
        return comisionesService.obtenerComisionesPorUsuario(username)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
