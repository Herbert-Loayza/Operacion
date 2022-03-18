package com.bootcamp.serviceoperacion.service.serviceImpl;

import com.bootcamp.serviceoperacion.entity.Cargo;
import com.bootcamp.serviceoperacion.entity.Pago;
import com.bootcamp.serviceoperacion.repository.CargoRepository;
import com.bootcamp.serviceoperacion.repository.PagoRepository;
import com.bootcamp.serviceoperacion.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoRepository cargoRepository;


    public Flux<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Mono<Cargo> findById(String id) {
        return cargoRepository.findById(id);
    }

    public Mono<Cargo> save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public Mono<Void> deleteById(String id) {
        return cargoRepository.deleteById(id);
    }
}
