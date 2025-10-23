package com.safco.mvp_safco.controllers;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.models.requests.UsuarioRequest;
import com.safco.mvp_safco.models.responses.UsuarioResponse;
import com.safco.mvp_safco.services.UsuariosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsuariosController {
    private final UsuariosService usuariosService;

    @PostMapping
    public ResponseEntity<Long> createUsuario( @Valid @RequestBody UsuarioRequest usuarioRequest){
        return ResponseEntity.ok(usuariosService.save(usuarioRequest));
    }

    @GetMapping
    public ResponseEntity<PageResponse<UsuarioResponse>> findAllUsuarios(
            @RequestParam(name = "page",defaultValue = "0",required = false) int page,
            @RequestParam(name = "size",defaultValue = "10",required = false) int size
    ){
        return ResponseEntity.ok(usuariosService.findAllUsuarios(page,size));
    }

    @DeleteMapping("/{idUsuariop}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long idUsuario){
        usuariosService.deleteUsuario(idUsuario);
        return ResponseEntity.noContent().build();
    }
}
