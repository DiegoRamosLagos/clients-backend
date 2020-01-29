package com.think.springboot.backend.apirest.models.dao;

import com.think.springboot.backend.apirest.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Long> {
}
