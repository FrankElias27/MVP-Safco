package com.safco.mvp_safco.services;

import com.safco.mvp_safco.commons.PageResponse;
import com.safco.mvp_safco.mappers.EquipoMapper;
import com.safco.mvp_safco.mappers.UsuarioMapper;
import com.safco.mvp_safco.models.Equipo;
import com.safco.mvp_safco.models.requests.EquipoRequest;
import com.safco.mvp_safco.models.responses.EquipoResponse;
import com.safco.mvp_safco.repositories.EquipoRepository;
import com.safco.mvp_safco.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipoService {

    private final EquipoRepository equipoRepository;
    private final EquipoMapper equipoMapper;

    public Long save(EquipoRequest request) {
        Equipo equipo = equipoMapper.toEquipos(request);
        return equipoRepository.save(equipo).getIdEquipo();
    }

    public PageResponse<EquipoResponse> findAllEquipos(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("idEquipo").descending());
        Page<Equipo> equipos = equipoRepository.findAllDisplayableEquipos(pageable);
        List<EquipoResponse> equipoResponses = equipos.stream()
                .map(equipoMapper::toEquipoResponse)
                .toList();
        return new PageResponse<>(
                equipoResponses,
                equipos.getNumber(),
                equipos.getSize(),
                equipos.getTotalElements(),
                equipos.getTotalPages(),
                equipos.isFirst(),
                equipos.isLast()
        );
    }

    public EquipoResponse findEquipoById(Long idEquipo) {
        Equipo equipo = equipoRepository.findById(idEquipo)
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado con ID: " + idEquipo));
        return equipoMapper.toEquipoResponse(equipo);
    }

    public Long updateEquipo(Long idEquipo, EquipoRequest request) {
        Equipo equipoExistente = equipoRepository.findById(idEquipo)
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado con ID: " + idEquipo));
        equipoMapper.updateEquipoFromRequest(request, equipoExistente);
        return equipoRepository.save(equipoExistente).getIdEquipo();
    }

    public void deleteEquipo(Long idEquipo) {
        Equipo equipo = equipoRepository.findById(idEquipo)
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado con ID: " + idEquipo));
        equipoRepository.delete(equipo);
    }


}
