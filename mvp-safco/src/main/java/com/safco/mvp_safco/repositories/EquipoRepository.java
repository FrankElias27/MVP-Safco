package com.safco.mvp_safco.repositories;

import com.safco.mvp_safco.models.Equipo;
import com.safco.mvp_safco.models.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EquipoRepository extends JpaRepository<Equipo,Long> {

    @Query("""
            SELECT e
            FROM Equipo e
            """)
    Page<Equipo> findAllDisplayableEquipos(Pageable pageable);
}
