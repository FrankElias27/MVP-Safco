package com.safco.mvp_safco.services;

import com.safco.mvp_safco.mappers.UsuarioMapper;
import com.safco.mvp_safco.models.Usuarios;
import com.safco.mvp_safco.repositories.UsuariosRepository;
import com.safco.mvp_safco.requests.UsuarioRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;
    private final UsuarioMapper usuarioMapper;

    public Long save(UsuarioRequest request){
        Usuarios usuarios = usuarioMapper.toUsuarios(request);
        return usuariosRepository.save(usuarios).getIdUsuario();
    }


}
