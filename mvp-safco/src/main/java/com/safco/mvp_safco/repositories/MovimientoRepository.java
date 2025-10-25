package com.safco.mvp_safco.repositories;

import com.safco.mvp_safco.models.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento,Long> {
}
