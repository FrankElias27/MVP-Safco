package com.safco.mvp_safco.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.safco.mvp_safco.models.enums.EstadoMovimiento;
import com.safco.mvp_safco.models.enums.TipoMovimiento;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
    private String modelo;
    private String serie;
    private String licenciaOffice;
    private String licenciaAntivirus;
    private String dni;
    private String responsable;
    private String area;
    private String empresaAsignada;
    private String ubicacion;
    private LocalDate fechaEntrega;
    private String observacionEntrega;
    private LocalDate fechaDevolucion;
    private String observacionDevolucion;
    private String motivoDevolucion;
    private EstadoMovimiento estado;

    @OneToMany(mappedBy = "movimientos",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleMovimiento> detalleMovimientos  = new HashSet<>();


}
