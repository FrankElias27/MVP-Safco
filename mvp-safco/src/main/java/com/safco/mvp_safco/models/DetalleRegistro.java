package com.safco.mvp_safco.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Detalle_Registro")
public class DetalleRegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuarios usuarios;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipos equipos;
}
