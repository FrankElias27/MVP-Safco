package com.safco.mvp_safco.mappers;


import com.safco.mvp_safco.models.Usuarios;
import com.safco.mvp_safco.requests.UsuarioRequest;
import org.springframework.stereotype.Service;

@Service
public class UsuarioMapper {

    public Usuarios toUsuarios(UsuarioRequest request){
        return Usuarios.builder()
                .idUsuario(request.idUsuario())
                .nombre(request.nombre())
                .apellido(request.apellido())
                .dni(request.dni())
                .anyDesk(request.anyDesk())
                .build();

    }

}
