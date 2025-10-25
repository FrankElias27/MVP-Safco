package com.safco.mvp_safco.services;

import com.safco.mvp_safco.mappers.MovimientoMapper;
import com.safco.mvp_safco.models.Movimiento;
import com.safco.mvp_safco.models.requests.MovimientoRequest;
import com.safco.mvp_safco.repositories.MovimientoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovimientoService {

    private final MovimientoRepository movimientoRepository;
    private final MovimientoMapper movimientoMapper;

    public Long save(MovimientoRequest request){
        Movimiento movimiento = movimientoMapper.toMovimientos(request);
        return movimientoRepository.save(movimiento).getIdMovimiento();
    }
}
