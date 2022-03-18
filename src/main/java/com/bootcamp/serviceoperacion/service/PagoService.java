package com.bootcamp.serviceoperacion.service;

import com.bootcamp.serviceoperacion.entity.Pago;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PagoService {

    public Flux<Pago> findAll();
    public Mono<Pago> findById(String id);
    public Mono<Pago>save(Pago Pago);
    public Mono<Void> deleteById(String id);
}
