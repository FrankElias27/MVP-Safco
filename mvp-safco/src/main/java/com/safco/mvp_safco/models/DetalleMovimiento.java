package com.safco.mvp_safco.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Detalles_Movimiento")
public class DetalleMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipos equipos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movimiento_id", nullable = false)
    private Movimientos movimientos;

}
