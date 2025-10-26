package com.safco.mvp_safco.models.requests;

import com.safco.mvp_safco.models.enums.TipoEmpresa;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record UsuarioRequest (
        Long idUsuario,
        String nombre,
        String apellido,
        String dni,
        String telefono,
        String anyDesk,
        String area,
        TipoEmpresa empresaAsignada,
        String ubicacion
){}




