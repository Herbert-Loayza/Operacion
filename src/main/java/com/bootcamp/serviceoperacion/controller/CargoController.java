package com.bootcamp.serviceoperacion.controller;

import com.bootcamp.serviceoperacion.entity.Cargo;
import com.bootcamp.serviceoperacion.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cargo")
public class CargoController {


    @Autowired
    private CargoService cargoService;

    @GetMapping
    public Flux<Cargo> findAll(){
        return cargoService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Cargo> findById(@PathVariable String id) {
        return cargoService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Cargo> save(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }

    @PutMapping
    public Mono<Cargo> put(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return cargoService.deleteById(id);
    }
}
