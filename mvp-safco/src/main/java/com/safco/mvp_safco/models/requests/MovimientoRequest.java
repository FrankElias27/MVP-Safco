package com.safco.mvp_safco.models.requests;

import com.safco.mvp_safco.models.enums.EstadoMovimiento;
import com.safco.mvp_safco.models.enums.TipoMovimiento;

import java.time.LocalDate;

public record MovimientoRequest(

        Long idMovimiento,
        TipoMovimiento tipo,
        String codInterno,
        String equipo,
        String marca,
        String modelo,
        String serie,
        String licenciaOffice,
        String licenciaAntivirus,
        String dni,
        String responsable,
        String area,
        String empresaAsignada,
        String ubicacion,
        LocalDate fechaEntrega,
        String observacionEntrega,
        LocalDate fechaDevolucion,
        String observacionDevolucion,
        String motivoDevolucion,
        EstadoMovimiento estado
) {
}
