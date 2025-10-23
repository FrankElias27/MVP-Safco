package com.safco.mvp_safco.services;

import com.safco.mvp_safco.mappers.MovimientoMapper;
import com.safco.mvp_safco.models.Movimientos;
import com.safco.mvp_safco.models.requests.MovimientoRequest;
import com.safco.mvp_safco.repositories.MovimientosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovimientoService {

    private final MovimientosRepository movimientosRepository;
    private final MovimientoMapper movimientoMapper;

    public Long save(MovimientoRequest request){
        Movimientos movimientos = movimientoMapper.toMovimientos(request);
        return movimientosRepository.save(movimientos).getIdMovimiento();
    }
}
