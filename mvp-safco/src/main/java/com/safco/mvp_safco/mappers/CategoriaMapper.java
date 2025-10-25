package com.safco.mvp_safco.mappers;

import com.safco.mvp_safco.models.Categoria;
import com.safco.mvp_safco.models.Usuario;
import com.safco.mvp_safco.models.requests.CategoriaRequest;
import com.safco.mvp_safco.models.requests.UsuarioRequest;
import com.safco.mvp_safco.models.responses.CategoriaResponse;
import com.safco.mvp_safco.models.responses.UsuarioResponse;
import org.springframework.stereotype.Service;

@Service
public class CategoriaMapper {

    public Categoria toCategorias(CategoriaRequest request){
        return Categoria.builder()
                .idCategoria(request.idCategoria())
                .titulo(request.titulo())
                .build();

    }

    public CategoriaResponse toCategoriaResponse(Categoria categoria){
        return CategoriaResponse.builder()
                .idCategoria(categoria.getIdCategoria())
                .titulo(categoria.getTitulo())
                .build();
    }
}
