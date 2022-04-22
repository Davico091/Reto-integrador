package com.bootcamp.api.payservice.PayServiceApi.service;

import com.bootcamp.api.payservice.PayServiceApi.bean.ServiciosEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PayServiceImpl implements PayService {
    @Override
    public Flux<ServiciosEntity> payServices(ServiciosEntity serviciosEntity) {
        Flux<ServiciosEntity> serviciosEntityFlux = Flux.just(serviciosEntity);
        return serviciosEntityFlux;
    }
}
