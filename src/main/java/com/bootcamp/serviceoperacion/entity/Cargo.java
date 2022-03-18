package com.bootcamp.serviceoperacion.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "cargo")
public class Cargo {

    @Id
    private String id;

}
