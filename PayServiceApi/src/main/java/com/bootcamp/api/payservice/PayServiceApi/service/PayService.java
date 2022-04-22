package com.bootcamp.api.payservice.PayServiceApi.service;

import com.bootcamp.api.payservice.PayServiceApi.bean.ServiciosEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


public interface PayService {
    Flux<ServiciosEntity> payServices(ServiciosEntity serviciosEntity);
}
