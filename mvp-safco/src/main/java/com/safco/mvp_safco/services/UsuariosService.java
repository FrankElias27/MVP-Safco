package com.safco.mvp_safco.services;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.mappers.UsuarioMapper;
import com.safco.mvp_safco.models.Usuarios;
import com.safco.mvp_safco.repositories.UsuariosRepository;
import com.safco.mvp_safco.requests.UsuarioRequest;
import com.safco.mvp_safco.responses.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;
    private final UsuarioMapper usuarioMapper;

    public Long save(UsuarioRequest request){
        Usuarios usuarios = usuarioMapper.toUsuarios(request);
        return usuariosRepository.save(usuarios).getIdUsuario();
    }

    public PageResponse<UsuarioResponse> findAllUsuarios(int page, int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("idUsuario").descending());
        Page<Usuarios> usuarios = usuariosRepository.findAllDisplayableUsuarios(pageable);
        List<UsuarioResponse> usuarioResponses = usuarios.stream()
                .map(usuarioMapper::toUsuarioResponse)
                .toList();
        return new PageResponse<>(
                usuarioResponses,
                usuarios.getNumber(),
                usuarios.getSize(),
                usuarios.getTotalElements(),
                usuarios.getTotalPages(),
                usuarios.isFirst(),
                usuarios.isLast()
        );
    }

    public void deleteUsuario(Long idUsuario){
        Usuarios usuarios = usuariosRepository.findById(idUsuario)
                .orElseThrow(()-> new RuntimeException("Usuario no encontrado con ID: "+ idUsuario));
        usuariosRepository.delete(usuarios);
    }


}
