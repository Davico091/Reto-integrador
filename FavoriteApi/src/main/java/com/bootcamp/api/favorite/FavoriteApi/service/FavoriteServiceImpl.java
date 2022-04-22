package com.bootcamp.api.favorite.FavoriteApi.service;

import com.bootcamp.api.favorite.FavoriteApi.entity.FavoriteEntity;
import com.bootcamp.api.favorite.FavoriteApi.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Flux<FavoriteEntity> getAll() {
        return this.favoriteRepository.findAll();
    }

    @Override
    public Mono<FavoriteEntity> save(FavoriteEntity favoriteEntity) {
        return this.favoriteRepository.save(favoriteEntity);
    }
}
