package com.safco.mvp_safco.models.requests;

public record UsuarioRequest (
        Long idUsuario,
        String nombre,
        String apellido,
        String dni,
        String anyDesk
){}




