package com.bootcamp.api.payservice.PayServiceApi.controller;

import com.bootcamp.api.payservice.PayServiceApi.bean.ServiciosEntity;
import com.bootcamp.api.payservice.PayServiceApi.repository.ServiceRepository;
import com.bootcamp.api.payservice.PayServiceApi.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MainController {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private PayService payService;


    @GetMapping("/services/{canal}")
    public Flux<ServiciosEntity> obtenerServicios(@PathVariable(name="canal") String canal){
        return  serviceRepository.obtenerPorCanal(canal);
    }

    @PostMapping("/services/payment")
    public Flux<ServiciosEntity> pagarServicio(@RequestBody ServiciosEntity serviciosEntity){

        return  payService.payServices(serviciosEntity);
    }
    
}
