package com.bootcamp.api.ux.UxApi.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ServicePayment {

    private String codigoServicio;

    private String numeroSuministro;

    private Double monto;


}
