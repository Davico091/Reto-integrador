package com.bootcamp.api.favorite.FavoriteApi.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("favorite")
@Data
public class FavoriteEntity {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);

    private String descripcion;

    private String tipo;

    private String codigoServicio;

}
