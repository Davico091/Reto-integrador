package com.bootcamp.api.favorite.FavoriteApi.repository;

import com.bootcamp.api.favorite.FavoriteApi.entity.FavoriteEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FavoriteRepository extends ReactiveMongoRepository<FavoriteEntity, String> {

}
