package com.safco.mvp_safco.models;

public class Movimientos {

    private Long idMovimiento;
    private String descripcionMovimiento;

    public Movimientos(String descripcionMovimiento, Long idMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
        this.idMovimiento = idMovimiento;
    }

    public Movimientos() {
    }

    public Long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
    }
}
