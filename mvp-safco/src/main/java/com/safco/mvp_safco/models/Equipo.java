package com.safco.mvp_safco.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.safco.mvp_safco.models.enums.EstadoEquipo;
import com.safco.mvp_safco.models.enums.TipoEquipo;
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
@Table(name = "equipo")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;

    private String codInterno;
    private String empresaCompra;
    private String linea;
    private String marca;
    private String modelo;
    private String serie;
    private String procesador;
    private String descripcionProce;
    private String memoriaRam;
    private String caracRAM;
    private String capacidadDiscoD;
    private String caracDiscoD;
    private String modeloCargador;
    private String serieCargador;
    private LocalDate fechaCompra;
    private String macWifi;
    private String licenciaOffice;
    private String licenciaAntivirus;

    @Enumerated(EnumType.STRING)
    private EstadoEquipo estadoEquipo;

    @Enumerated(EnumType.STRING)
    private TipoEquipo tipoEquipo;

    @OneToMany(mappedBy = "equipo",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleMovimiento> detalleMovimientos  = new HashSet<>();

    @OneToMany(mappedBy = "equipo",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleRegistro> detalleRegistros  = new HashSet<>();





}
