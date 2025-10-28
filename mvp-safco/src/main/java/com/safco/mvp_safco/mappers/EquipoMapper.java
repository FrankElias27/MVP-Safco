package com.safco.mvp_safco.mappers;

import com.safco.mvp_safco.models.Equipo;
import com.safco.mvp_safco.models.Usuario;
import com.safco.mvp_safco.models.requests.EquipoRequest;
import com.safco.mvp_safco.models.requests.UsuarioRequest;
import com.safco.mvp_safco.models.responses.EquipoResponse;
import com.safco.mvp_safco.models.responses.UsuarioResponse;
import org.springframework.stereotype.Service;

@Service
public class EquipoMapper {

    public Equipo toEquipos(EquipoRequest request){
        return Equipo.builder()
                .idEquipo(request.idEquipo())
                .codInterno(request.codInterno())
                .empresaCompra(request.empresaCompra())
                .linea(request.linea())
                .marca(request.marca())
                .modelo(request.modelo())
                .serie(request.serie())
                .procesador(request.procesador())
                .descripcionProce(request.descripcionProce())
                .memoriaRam(request.memoriaRam())
                .caracRAM(request.caracRAM())
                .capacidadDiscoD(request.capacidadDiscoD())
                .caracDiscoD(request.caracDiscoD())
                .modeloCargador(request.modeloCargador())
                .serieCargador(request.serieCargador())
                .fechaCompra(request.fechaCompra())
                .macWifi(request.macWifi())
                .licenciaOffice(request.licenciaOffice())
                .licenciaAntivirus(request.licenciaAntivirus())
                .estadoEquipo(request.estadoEquipo())
                .tipoEquipo(request.tipoEquipo())
                .build();

    }

    public EquipoResponse toEquipoResponse(Equipo equipo){
        return EquipoResponse.builder()
                .idEquipo(equipo.getIdEquipo())
                .codInterno(equipo.getCodInterno())
                .empresaCompra(equipo.getEmpresaCompra())
                .linea(equipo.getLinea())
                .marca(equipo.getMarca())
                .modelo(equipo.getModelo())
                .serie(equipo.getSerie())
                .procesador(equipo.getProcesador())
                .descripcionProce(equipo.getDescripcionProce())
                .memoriaRam(equipo.getMemoriaRam())
                .caracRAM(equipo.getCaracRAM())
                .capacidadDiscoD(equipo.getCapacidadDiscoD())
                .caracDiscoD(equipo.getCaracDiscoD())
                .modeloCargador(equipo.getModeloCargador())
                .serieCargador(equipo.getSerieCargador())
                .fechaCompra(equipo.getFechaCompra())
                .macWifi(equipo.getMacWifi())
                .licenciaOffice(equipo.getLicenciaOffice())
                .licenciaAntivirus(equipo.getLicenciaAntivirus())
                .estadoEquipo(equipo.getEstadoEquipo())
                .tipoEquipo(equipo.getTipoEquipo())
                .build();
    }

    public void updateEquipoFromRequest(EquipoRequest request, Equipo equipo) {
        equipo.setCodInterno(request.codInterno());
        equipo.setEmpresaCompra(request.empresaCompra());
        equipo.setLinea(request.linea());
        equipo.setMarca(request.marca());
        equipo.setModelo(request.modelo());
        equipo.setSerie(request.serie());
        equipo.setProcesador(request.procesador());
        equipo.setDescripcionProce(request.descripcionProce());
        equipo.setMemoriaRam(request.memoriaRam());
        equipo.setCaracRAM(request.caracRAM());
        equipo.setCapacidadDiscoD(request.capacidadDiscoD());
        equipo.setCaracDiscoD(request.caracDiscoD());
        equipo.setModeloCargador(request.modeloCargador());
        equipo.setSerieCargador(request.serieCargador());
        equipo.setFechaCompra(request.fechaCompra());
        equipo.setMacWifi(request.macWifi());
        equipo.setLicenciaOffice(request.licenciaOffice());
        equipo.setLicenciaAntivirus(request.licenciaAntivirus());
        equipo.setEstadoEquipo(request.estadoEquipo());
        equipo.setTipoEquipo(request.tipoEquipo());
    }
}
