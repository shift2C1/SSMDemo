package com.test.service;


import com.test.dao.BumenMapper;
import com.test.entity.Bumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BumenService {

    @Autowired
    BumenMapper bumenMapper;
    public String getBumenById(String id){
        Bumen bumen=bumenMapper.getBumenById(id);
        return bumen.toString();
    }
}
