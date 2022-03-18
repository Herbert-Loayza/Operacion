package com.bootcamp.serviceoperacion.repository;

import com.bootcamp.serviceoperacion.entity.Cargo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CargoRepository extends ReactiveMongoRepository<Cargo, String> {
}
