package com.safco.mvp_safco.models.requests;

import com.safco.mvp_safco.models.enums.EstadoEquipo;
import com.safco.mvp_safco.models.enums.TipoEquipo;

import java.time.LocalDate;

public record EquipoRequest(
        Long idEquipo,
        String codInterno,
        String empresaCompra,
        String linea,
        String marca,
        String modelo,
        String serie,
        String procesador,
        String descripcionProce,
        String memoriaRam,
        String caracRAM,
        String capacidadDiscoD,
        String caracDiscoD,
        String modeloCargador,
        String serieCargador,
        LocalDate fechaCompra,
        String macWifi,
        String licenciaOffice,
        String licenciaAntivirus,
        EstadoEquipo estadoEquipo,
        TipoEquipo tipoEquipo
) {
}
