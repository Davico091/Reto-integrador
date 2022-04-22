package com.bootcamp.api.ux.UxApi.controller;


import com.bootcamp.api.ux.UxApi.bean.ServicePayment;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class MainController {

    @GetMapping("service/{channel}")
    public Mono <String> getServices(@PathVariable("channel") final String channel){
        Mono<String> helloWorldCallable = Mono.fromCallable(() -> "Servicios para el canal" + channel);
        return helloWorldCallable;
    }

    @PostMapping("service/payment")
    public Mono <String> getServices(@RequestBody final ServicePayment servicePayment){
        Mono<String> prueba = Mono.fromCallable(() -> "pruebita de servicio " + servicePayment.getCodigoServicio()+
                servicePayment.getNumeroSuministro()+
                servicePayment.getMonto());
        return prueba;
    }

}
