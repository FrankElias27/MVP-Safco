package com.safco.mvp_safco.models;

import com.safco.mvp_safco.models.Enums.Estado;
import com.safco.mvp_safco.models.Enums.EstadoMovimiento;
import com.safco.mvp_safco.models.Enums.TipoMovimiento;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Detalles")
public class DetalleMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private TipoMovimiento tipo;

    private String codInterno;
    private String equipo;
    private String marca;
    private String Modelo;
    private String Serie;
    private String LicenciaOffice;
    private String LicenciaAntivirus;
    private String DNI;
    private String Responsable;
    private String Area;
    private String EmpresaAsignada;
    private String Ubicacion;
    private LocalDate FechaEntrega;
    private String ObservacionEntrega;
    private LocalDate FechaDevolucion;
    private String ObservacionDevolucion;
    private String MotivoDevolucion;
    private EstadoMovimiento Estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipos equipos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movimiento_id", nullable = false)
    private Movimientos movimientos;

}
