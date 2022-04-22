package com.bootcamp.api.payservice.PayServiceApi.repository;

import com.bootcamp.api.payservice.PayServiceApi.bean.ServiciosEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ServiceRepository extends ReactiveCrudRepository <ServiciosEntity,Long> {

    @Query("SELECT * FROM servicios WHERE canal = :canal")
    Flux<ServiciosEntity> obtenerPorCanal(String canal);
}
