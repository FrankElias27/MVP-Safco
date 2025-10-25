package com.safco.mvp_safco.services;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.mappers.CategoriaMapper;
import com.safco.mvp_safco.mappers.UsuarioMapper;
import com.safco.mvp_safco.models.Categoria;
import com.safco.mvp_safco.models.Usuario;
import com.safco.mvp_safco.models.requests.CategoriaRequest;
import com.safco.mvp_safco.models.requests.UsuarioRequest;
import com.safco.mvp_safco.models.responses.CategoriaResponse;
import com.safco.mvp_safco.models.responses.UsuarioResponse;
import com.safco.mvp_safco.repositories.CategoriaRepository;
import com.safco.mvp_safco.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;

    public Long save(CategoriaRequest request) {
        Categoria categoria = categoriaMapper.toCategorias(request);
        return categoriaRepository.save(categoria).getIdCategoria();
    }

    public PageResponse<CategoriaResponse> findAllCategorias(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("idCategoria").descending());
        Page<Categoria> categorias = categoriaRepository.findAllDisplayableCategorias(pageable);
        List<CategoriaResponse> categoriaResponses = categorias.stream()
                .map(categoriaMapper::toCategoriaResponse)
                .toList();
        return new PageResponse<>(
                categoriaResponses,
                categorias.getNumber(),
                categorias.getSize(),
                categorias.getTotalElements(),
                categorias.getTotalPages(),
                categorias.isFirst(),
                categorias.isLast()
        );
    }

    public void deleteCategoria(Long idCategoria) {
        Categoria categoria = categoriaRepository.findById(idCategoria)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con ID: " + idCategoria));
        categoriaRepository.delete(categoria);
    }
}
