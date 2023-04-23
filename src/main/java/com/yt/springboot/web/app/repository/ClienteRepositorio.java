package com.yt.springboot.web.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yt.springboot.web.app.model.Cliente;

public interface ClienteRepositorio extends MongoRepository<Cliente, Integer>{

}
