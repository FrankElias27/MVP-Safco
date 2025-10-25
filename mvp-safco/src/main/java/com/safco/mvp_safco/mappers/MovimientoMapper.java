package com.safco.mvp_safco.mappers;

import com.safco.mvp_safco.models.Movimiento;
import com.safco.mvp_safco.models.requests.MovimientoRequest;
import org.springframework.stereotype.Service;

@Service
public class MovimientoMapper {

    public Movimiento toMovimientos(MovimientoRequest request){
        return Movimiento.builder()
                .idMovimiento(request.idMovimiento())
                .tipo(request.tipo())
                .codInterno(request.codInterno())
                .equipo(request.equipo())
                .marca(request.marca())
                .build();

    }
}
