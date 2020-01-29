package com.think.springboot.backend.apirest.models.services;

import com.think.springboot.backend.apirest.models.entity.Client;

import java.util.List;

public interface IClientService {
    public List<Client> findAll();
}
