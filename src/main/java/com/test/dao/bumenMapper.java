package com.test.dao;

import com.test.entity.Bumen;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface bumenMapper {

    public Bumen getBumenById(String id);
}
