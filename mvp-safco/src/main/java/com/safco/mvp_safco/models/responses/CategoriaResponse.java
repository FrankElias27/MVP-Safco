package com.safco.mvp_safco.models.responses;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaResponse {

    private Long idCategoria;
    private String titulo;
}
