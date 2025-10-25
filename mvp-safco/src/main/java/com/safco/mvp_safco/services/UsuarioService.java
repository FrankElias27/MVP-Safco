package com.safco.mvp_safco.services;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.mappers.UsuarioMapper;
import com.safco.mvp_safco.models.Usuario;
import com.safco.mvp_safco.repositories.UsuarioRepository;
import com.safco.mvp_safco.models.requests.UsuarioRequest;
import com.safco.mvp_safco.models.responses.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public Long save(UsuarioRequest request){
        Usuario usuario = usuarioMapper.toUsuarios(request);
        return usuarioRepository.save(usuario).getIdUsuario();
    }

    public PageResponse<UsuarioResponse> findAllUsuarios(int page, int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("idUsuario").descending());
        Page<Usuario> usuarios = usuarioRepository.findAllDisplayableUsuarios(pageable);
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
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(()-> new RuntimeException("Usuario no encontrado con ID: "+ idUsuario));
        usuarioRepository.delete(usuario);
    }


}
