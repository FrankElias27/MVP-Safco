package com.safco.mvp_safco.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.safco.mvp_safco.models.enums.EstadoMovimiento;
import com.safco.mvp_safco.models.enums.TipoMovimiento;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "movimiento")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimiento;

    private LocalDate fechaMovimiento;
    private String observacionMovimiento;
    private String motivoMovimiento;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    @Enumerated(EnumType.STRING)
    private EstadoMovimiento estado;

    @OneToMany(mappedBy = "movimiento",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DetalleMovimiento> detalleMovimientos  = new HashSet<>();


}
