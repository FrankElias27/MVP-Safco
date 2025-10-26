package com.safco.mvp_safco.models.responses;

import com.safco.mvp_safco.models.enums.TipoEmpresa;
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
    private String telefono;
    private String anyDesk;
    private String area;
    private TipoEmpresa empresaAsignada;
    private String ubicacion;
}
