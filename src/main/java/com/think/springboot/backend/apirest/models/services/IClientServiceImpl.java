package com.think.springboot.backend.apirest.models.services;

import com.think.springboot.backend.apirest.models.dao.IClientDao;
import com.think.springboot.backend.apirest.models.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IClientServiceImpl implements IClientService {

    @Autowired
    private IClientDao clientDao;
    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) clientDao.findAll();
    }
}
