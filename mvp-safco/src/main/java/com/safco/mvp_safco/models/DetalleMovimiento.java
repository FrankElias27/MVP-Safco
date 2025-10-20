package com.safco.mvp_safco.models;

import com.safco.mvp_safco.models.Enums.Estado;
import com.safco.mvp_safco.models.Enums.EstadoMovimiento;
import com.safco.mvp_safco.models.Enums.TipoMovimiento;

import java.time.LocalDate;

public class DetalleMovimiento {

    private Long idDetalle;
    private TipoMovimiento Tipo;

    private String CodInterno;
    private String Equipo;
    private String Marca;
    private String Modelo;
    private String Serie;
    private String LicenciaOffice;
    private String LicenciaAntivirus;
    private String DNI;
    private String Responsable;
    private String Area;
    private String EmpresaAsignada;
    private String Ubicacion;
    private LocalDate FechaEntrega;
    private String ObservacionEntrega;
    private LocalDate FechaDevolucion;
    private String ObservacionDevolucion;
    private String MotivoDevolucion;
    private EstadoMovimiento Estado;

    public DetalleMovimiento(Long idDetalle, TipoMovimiento tipo, String codInterno, String equipo, String marca, String modelo, String serie, String licenciaOffice, String licenciaAntivirus, String DNI, String responsable, String area, String empresaAsignada, String ubicacion, LocalDate fechaEntrega, String observacionEntrega, LocalDate fechaDevolucion, String observacionDevolucion, String motivoDevolucion, EstadoMovimiento estado) {
        this.idDetalle = idDetalle;
        Tipo = tipo;
        CodInterno = codInterno;
        Equipo = equipo;
        Marca = marca;
        Modelo = modelo;
        Serie = serie;
        LicenciaOffice = licenciaOffice;
        LicenciaAntivirus = licenciaAntivirus;
        this.DNI = DNI;
        Responsable = responsable;
        Area = area;
        EmpresaAsignada = empresaAsignada;
        Ubicacion = ubicacion;
        FechaEntrega = fechaEntrega;
        ObservacionEntrega = observacionEntrega;
        FechaDevolucion = fechaDevolucion;
        ObservacionDevolucion = observacionDevolucion;
        MotivoDevolucion = motivoDevolucion;
        Estado = estado;
    }

    public DetalleMovimiento() {
    }

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public TipoMovimiento getTipo() {
        return Tipo;
    }

    public void setTipo(TipoMovimiento tipo) {
        Tipo = tipo;
    }

    public String getCodInterno() {
        return CodInterno;
    }

    public void setCodInterno(String codInterno) {
        CodInterno = codInterno;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getLicenciaOffice() {
        return LicenciaOffice;
    }

    public void setLicenciaOffice(String licenciaOffice) {
        LicenciaOffice = licenciaOffice;
    }

    public String getLicenciaAntivirus() {
        return LicenciaAntivirus;
    }

    public void setLicenciaAntivirus(String licenciaAntivirus) {
        LicenciaAntivirus = licenciaAntivirus;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getEmpresaAsignada() {
        return EmpresaAsignada;
    }

    public void setEmpresaAsignada(String empresaAsignada) {
        EmpresaAsignada = empresaAsignada;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public LocalDate getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

    public String getObservacionEntrega() {
        return ObservacionEntrega;
    }

    public void setObservacionEntrega(String observacionEntrega) {
        ObservacionEntrega = observacionEntrega;
    }

    public LocalDate getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        FechaDevolucion = fechaDevolucion;
    }

    public String getObservacionDevolucion() {
        return ObservacionDevolucion;
    }

    public void setObservacionDevolucion(String observacionDevolucion) {
        ObservacionDevolucion = observacionDevolucion;
    }

    public String getMotivoDevolucion() {
        return MotivoDevolucion;
    }

    public void setMotivoDevolucion(String motivoDevolucion) {
        MotivoDevolucion = motivoDevolucion;
    }

    public EstadoMovimiento getEstado() {
        return Estado;
    }

    public void setEstado(EstadoMovimiento estado) {
        Estado = estado;
    }
}
