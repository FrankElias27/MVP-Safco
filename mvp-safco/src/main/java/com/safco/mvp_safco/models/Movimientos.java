package com.safco.mvp_safco.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.safco.mvp_safco.enums.EstadoMovimiento;
import com.safco.mvp_safco.enums.TipoMovimiento;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Movimientos")
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimiento;

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

    @OneToMany(mappedBy = "movimientos",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleMovimiento> detalleMovimientos  = new HashSet<>();


}
