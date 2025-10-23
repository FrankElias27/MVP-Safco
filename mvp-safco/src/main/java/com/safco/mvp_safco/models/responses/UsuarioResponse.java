package com.safco.mvp_safco.models.responses;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponse {

    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String dni;
    private String anyDesk;
}
