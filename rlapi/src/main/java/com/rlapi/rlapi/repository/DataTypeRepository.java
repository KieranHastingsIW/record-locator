package com.rlapi.rlapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlapi.rlapi.Entity.DataType;

public interface DataTypeRepository extends JpaRepository<DataType, Long>{
    
}
