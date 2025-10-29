package com.safco.mvp_safco.controllers;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.models.requests.EquipoRequest;
import com.safco.mvp_safco.models.responses.EquipoResponse;
import com.safco.mvp_safco.services.EquipoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("equipos")
@RequiredArgsConstructor
public class EquiposController {

    private final EquipoService equipoService;

    @PostMapping
    public ResponseEntity<Long> createEquipo(@Valid @RequestBody EquipoRequest equipoRequest) {
        return ResponseEntity.ok(equipoService.save(equipoRequest));
    }

    @GetMapping
    public ResponseEntity<PageResponse<EquipoResponse>> findAllEquipos(
            @RequestParam(name = "page", defaultValue = "0", required = false) int page,
            @RequestParam(name = "size", defaultValue = "10", required = false) int size
    ) {
        return ResponseEntity.ok(equipoService.findAllEquipos(page, size));
    }


    @GetMapping("/{idEquipo}")
    public ResponseEntity<EquipoResponse> findEquipoById(@PathVariable Long idEquipo) {
        EquipoResponse response = equipoService.findEquipoById(idEquipo);
        return ResponseEntity.ok(response);
    }


    @PutMapping("/{idEquipo}")
    public ResponseEntity<Long> updateEquipo(
            @PathVariable Long idEquipo,
            @Valid @RequestBody EquipoRequest equipoRequest
    ) {
        Long updatedId = equipoService.updateEquipo(idEquipo, equipoRequest);
        return ResponseEntity.ok(updatedId);
    }

    @DeleteMapping("/{idEquipo}")
    public ResponseEntity<Void> deleteEquipo(@PathVariable Long idEquipo) {
        equipoService.deleteEquipo(idEquipo);
        return ResponseEntity.noContent().build();
    }
}
