package com.bravo.challenge.cobranzas.repository;

import com.bravo.challenge.cobranzas.model.Comision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComisionRepository extends JpaRepository<Comision, Long> {
    Optional<Comision> findByUsuario(String usuario);
}
