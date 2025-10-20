package com.safco.mvp_safco.models;

import com.safco.mvp_safco.models.Enums.Estado;
import com.safco.mvp_safco.models.Enums.Tipo;

import java.time.LocalDate;

public class Equipos {

    private Long idEquipo;

    private String CodInterno;
    private String EmpresaCompra;

    private String Linea;
    private String Marca;
    private String Modelo;
    private String Serie;
    private String Procesador;
    private String DescripcionProce;
    private String RAM;
    private String CaracRAM;
    private String CapacidadDiscoD;
    private String CaracDiscoD;
    private String ModeloCargador;
    private String SerieCargador;


    private LocalDate FechaCompra;
    private String MACWifi;
    private Estado Estado;
    private Tipo Tipo;

    public Equipos(Long idEquipo, String codInterno, String empresaCompra, String linea, String marca, String modelo, String serie, String procesador, String descripcionProce, String RAM, String caracRAM, String capacidadDiscoD, String caracDiscoD, String modeloCargador, String serieCargador, LocalDate fechaCompra, String MACWifi, Estado estado, Tipo tipo) {
        this.idEquipo = idEquipo;
        CodInterno = codInterno;
        EmpresaCompra = empresaCompra;
        Linea = linea;
        Marca = marca;
        Modelo = modelo;
        Serie = serie;
        Procesador = procesador;
        DescripcionProce = descripcionProce;
        this.RAM = RAM;
        CaracRAM = caracRAM;
        CapacidadDiscoD = capacidadDiscoD;
        CaracDiscoD = caracDiscoD;
        ModeloCargador = modeloCargador;
        SerieCargador = serieCargador;
        FechaCompra = fechaCompra;
        this.MACWifi = MACWifi;
        Estado = estado;
        Tipo = tipo;
    }

    public Equipos() {
    }

    public Tipo getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo tipo) {
        Tipo = tipo;
    }

    public Estado getEstado() {
        return Estado;
    }

    public void setEstado(Estado estado) {
        Estado = estado;
    }

    public String getMACWifi() {
        return MACWifi;
    }

    public void setMACWifi(String MACWifi) {
        this.MACWifi = MACWifi;
    }



    public String getSerieCargador() {
        return SerieCargador;
    }

    public void setSerieCargador(String serieCargador) {
        SerieCargador = serieCargador;
    }

    public String getModeloCargador() {
        return ModeloCargador;
    }

    public void setModeloCargador(String modeloCargador) {
        ModeloCargador = modeloCargador;
    }

    public String getCaracDiscoD() {
        return CaracDiscoD;
    }

    public void setCaracDiscoD(String caracDiscoD) {
        CaracDiscoD = caracDiscoD;
    }

    public String getCapacidadDiscoD() {
        return CapacidadDiscoD;
    }

    public void setCapacidadDiscoD(String capacidadDiscoD) {
        CapacidadDiscoD = capacidadDiscoD;
    }

    public String getCaracRAM() {
        return CaracRAM;
    }

    public void setCaracRAM(String caracRAM) {
        CaracRAM = caracRAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getDescripcionProce() {
        return DescripcionProce;
    }

    public void setDescripcionProce(String descripcionProce) {
        DescripcionProce = descripcionProce;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String linea) {
        Linea = linea;
    }

    public String getEmpresaCompra() {
        return EmpresaCompra;
    }

    public void setEmpresaCompra(String empresaCompra) {
        EmpresaCompra = empresaCompra;
    }

    public String getCodInterno() {
        return CodInterno;
    }

    public void setCodInterno(String codInterno) {
        CodInterno = codInterno;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public LocalDate getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        FechaCompra = fechaCompra;
    }
}
