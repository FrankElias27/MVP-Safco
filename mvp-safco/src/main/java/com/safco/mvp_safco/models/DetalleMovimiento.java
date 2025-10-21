package com.safco.mvp_safco.models;

import com.safco.mvp_safco.models.Enums.Estado;
import com.safco.mvp_safco.models.Enums.EstadoMovimiento;
import com.safco.mvp_safco.models.Enums.TipoMovimiento;
import jakarta.persistence.*;

import java.time.LocalDate;
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
