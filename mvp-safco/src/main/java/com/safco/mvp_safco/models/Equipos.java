package com.safco.mvp_safco.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.safco.mvp_safco.models.Enums.Estado;
import com.safco.mvp_safco.models.Enums.Tipo;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Equipos")
public class Equipos {

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
    private Estado estado;
    private Tipo tipo;

    @OneToMany(mappedBy = "equipos",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleMovimiento> detalleMovimientos  = new HashSet<>();



}
