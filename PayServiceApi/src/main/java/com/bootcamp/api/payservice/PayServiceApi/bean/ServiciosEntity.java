package com.bootcamp.api.payservice.PayServiceApi.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("servicios")
public class ServiciosEntity {

    @Id
    @Column("codigoServicio")
    private Long codigoServicio;
    @Column("numeroSuministro")
    private String numeroSuministro;
    @Column("descripcion")
    private String descripcion;
    @Column("monto")
    private double monto;
    @Column("canal")
    private String canal;
}
