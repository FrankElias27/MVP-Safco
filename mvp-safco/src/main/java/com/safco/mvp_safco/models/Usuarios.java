package com.safco.mvp_safco.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;

import java.util.HashSet;
import java.util.Set;

@Builder
@Entity
@Table(name = "Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombre;
    private String apellido;
    private String dni;
    private String anyDesk;

    @OneToMany(mappedBy = "usuarios",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleRegistro> detalleRegistros  = new HashSet<>();

    public Usuarios() {
    }

    public Usuarios(Long idUsuario, String nombre, String apellido, String dni, String anyDesk, Set<DetalleRegistro> detalleRegistros) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anyDesk = anyDesk;
        this.detalleRegistros = detalleRegistros;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAnyDesk() {
        return anyDesk;
    }

    public void setAnyDesk(String anyDesk) {
        this.anyDesk = anyDesk;
    }

    public Set<DetalleRegistro> getDetalleRegistros() {
        return detalleRegistros;
    }

    public void setDetalleRegistros(Set<DetalleRegistro> detalleRegistros) {
        this.detalleRegistros = detalleRegistros;
    }
}
