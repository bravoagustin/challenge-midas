package com.bravo.challenge.cobranzas.service;

import com.bravo.challenge.cobranzas.model.Comision;
import com.bravo.challenge.cobranzas.repository.ComisionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComisionesService {

    private final ComisionRepository comisionRepository;

    public ComisionesService(ComisionRepository comisionRepository) {
        this.comisionRepository = comisionRepository;
    }

    public Optional<Comision> obtenerComisionesPorUsuario(String usuario) {
        return comisionRepository.findByUsuario(usuario);
    }
}
