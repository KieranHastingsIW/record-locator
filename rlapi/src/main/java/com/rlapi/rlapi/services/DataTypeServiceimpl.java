package com.rlapi.rlapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rlapi.rlapi.Entity.DataType;
import com.rlapi.rlapi.repository.DataTypeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DataTypeServiceimpl implements DataTypeService{
    
    DataTypeRepository dataTypeRepository;

    @Override
    public List<DataType> getAllDataTypes() {
        return dataTypeRepository.findAll();
    }
    
}
