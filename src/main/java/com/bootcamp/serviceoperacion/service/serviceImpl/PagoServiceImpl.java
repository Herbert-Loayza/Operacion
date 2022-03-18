package com.bootcamp.serviceoperacion.service.serviceImpl;

import com.bootcamp.serviceoperacion.entity.Pago;
import com.bootcamp.serviceoperacion.repository.PagoRepository;
import com.bootcamp.serviceoperacion.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoRepository pagoRepository;


    public Flux<Pago> findAll() {
        return pagoRepository.findAll();
    }

    public Mono<Pago> findById(String id) {
        return pagoRepository.findById(id);
    }

    public Mono<Pago> save(Pago pago) {
        return pagoRepository.save(pago);
    }

    public Mono<Void> deleteById(String id) {
        return pagoRepository.deleteById(id);
    }
}
