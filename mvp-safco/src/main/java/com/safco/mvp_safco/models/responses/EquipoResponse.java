package com.safco.mvp_safco.models.responses;

import com.safco.mvp_safco.models.enums.EstadoEquipo;
import com.safco.mvp_safco.models.enums.TipoEquipo;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipoResponse {

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

    private EstadoEquipo estadoEquipo;
    private TipoEquipo tipoEquipo;
}
