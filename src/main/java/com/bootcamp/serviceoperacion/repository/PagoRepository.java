package com.bootcamp.serviceoperacion.repository;

import com.bootcamp.serviceoperacion.entity.Pago;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PagoRepository extends ReactiveMongoRepository<Pago,String> {
}
