package com.bootcamp.api.favorite.FavoriteApi.service;

import com.bootcamp.api.favorite.FavoriteApi.entity.FavoriteEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FavoriteService {
    Flux<FavoriteEntity> getAll();

    Mono<FavoriteEntity> save(FavoriteEntity favoriteEntity);
}
