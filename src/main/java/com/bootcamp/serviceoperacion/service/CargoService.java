package com.bootcamp.serviceoperacion.service;

import com.bootcamp.serviceoperacion.entity.Cargo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CargoService {

    public Flux<Cargo> findAll();
    public Mono<Cargo> findById(String id);
    public Mono<Cargo>save(Cargo cargo);
    public Mono<Void> deleteById(String id);
}
