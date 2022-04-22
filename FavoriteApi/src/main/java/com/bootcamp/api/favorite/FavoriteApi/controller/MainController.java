package com.bootcamp.api.favorite.FavoriteApi.controller;

import com.bootcamp.api.favorite.FavoriteApi.entity.FavoriteEntity;
import com.bootcamp.api.favorite.FavoriteApi.repository.FavoriteRepository;
import com.bootcamp.api.favorite.FavoriteApi.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MainController {
    @Autowired
    private FavoriteService favoriteService;


    @GetMapping("/Favorite")
    public Flux<FavoriteEntity> getAll(){
        return this.favoriteService.getAll();
    }

    @PostMapping("/Favorite")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<FavoriteEntity> insertFavorite(@RequestBody FavoriteEntity favoriteEntity){
        return this.favoriteService.save(favoriteEntity);
    }
}
