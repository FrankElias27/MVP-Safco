package com.safco.mvp_safco.repositories;

import com.safco.mvp_safco.models.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query("""
            SELECT u
            FROM Usuario u
            """)
    Page<Usuario> findAllDisplayableUsuarios(Pageable pageable);
}
