package com.safco.mvp_safco.repositories;

import com.safco.mvp_safco.models.Movimientos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientosRepository extends JpaRepository<Movimientos,Long> {
}
