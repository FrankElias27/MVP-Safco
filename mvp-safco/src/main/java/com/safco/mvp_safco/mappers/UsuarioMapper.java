package com.safco.mvp_safco.mappers;


import com.safco.mvp_safco.models.Usuario;
import com.safco.mvp_safco.models.requests.UsuarioRequest;
import com.safco.mvp_safco.models.responses.UsuarioResponse;
import org.springframework.stereotype.Service;

@Service
public class UsuarioMapper {

    public Usuario toUsuarios(UsuarioRequest request){
        return Usuario.builder()
                .idUsuario(request.idUsuario())
                .nombre(request.nombre())
                .apellido(request.apellido())
                .dni(request.dni())
                .telefono(request.telefono())
                .anyDesk(request.anyDesk())
                .area(request.area())
                .empresaAsignada(request.empresaAsignada())
                .ubicacion(request.ubicacion())
                .build();

    }

    public UsuarioResponse toUsuarioResponse(Usuario usuario){
        return UsuarioResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .dni(usuario.getDni())
                .telefono(usuario.getTelefono())
                .anyDesk(usuario.getAnyDesk())
                .area(usuario.getArea())
                .empresaAsignada(usuario.getEmpresaAsignada())
                .ubicacion(usuario.getUbicacion())
                .build();
    }

}
