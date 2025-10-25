package com.safco.mvp_safco.controllers;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.models.requests.CategoriaRequest;
import com.safco.mvp_safco.models.responses.CategoriaResponse;
import com.safco.mvp_safco.services.CategoriaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("categoria")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Long> createCategoria(@Valid @RequestBody CategoriaRequest categoriaRequest) {
        return ResponseEntity.ok(categoriaService.save(categoriaRequest));
    }

    @GetMapping
    public ResponseEntity<PageResponse<CategoriaResponse>> findAllCategorias(
            @RequestParam(name = "page", defaultValue = "0", required = false) int page,
            @RequestParam(name = "size", defaultValue = "10", required = false) int size
    ) {
        return ResponseEntity.ok(categoriaService.findAllCategorias(page, size));
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long idCategoria) {
        categoriaService.deleteCategoria(idCategoria);
        return ResponseEntity.noContent().build();
    }
}
