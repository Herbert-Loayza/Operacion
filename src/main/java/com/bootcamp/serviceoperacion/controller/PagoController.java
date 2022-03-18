package com.bootcamp.serviceoperacion.controller;


import com.bootcamp.serviceoperacion.entity.Pago;
import com.bootcamp.serviceoperacion.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private PagoService pagoService;


    @GetMapping
    public Flux<Pago> findAll(){
        return pagoService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Pago> findById(@PathVariable String id) {
        return pagoService.findById(id);
    }

    @PostMapping("/upload")
    public Mono<Pago> save(@RequestBody Pago pago) {
        return pagoService.save(pago);
    }

    @PutMapping
    public Mono<Pago> put(@RequestBody Pago pago) {
        return pagoService.save(pago);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
            return pagoService.deleteById(id);
    }

}
