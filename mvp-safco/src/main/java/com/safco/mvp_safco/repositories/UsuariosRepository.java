package com.safco.mvp_safco.repositories;

import com.safco.mvp_safco.models.Usuarios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {

    @Query("""
            SELECT u
            FROM Usuarios u
            """)
    Page<Usuarios> findAllDisplayableUsuarios(Pageable pageable);
}
