package com.safco.mvp_safco.controllers;

import com.safco.mvp_safco.requests.UsuarioRequest;
import com.safco.mvp_safco.responses.UsuarioResponse;
import com.safco.mvp_safco.services.UsuariosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsuariosController {
    private final UsuariosService usuariosService;

    @PostMapping
    public ResponseEntity<Long> createUsuario( @Valid @RequestBody UsuarioRequest usuarioRequest){
        return ResponseEntity.ok(usuariosService.save(usuarioRequest));
    }
}
