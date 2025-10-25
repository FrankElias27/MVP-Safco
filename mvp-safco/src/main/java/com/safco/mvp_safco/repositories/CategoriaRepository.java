package com.safco.mvp_safco.repositories;

import com.safco.mvp_safco.models.Categoria;
import com.safco.mvp_safco.models.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

    @Query("""
            SELECT c
            FROM Categoria c
            """)
    Page<Categoria> findAllDisplayableCategorias(Pageable pageable);
}
