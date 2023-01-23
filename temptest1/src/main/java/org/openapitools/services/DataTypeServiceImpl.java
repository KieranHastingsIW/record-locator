package org.openapitools.services;

import java.util.List;

import org.openapitools.model.RLSDataTypePOSTAPISchema;
import org.openapitools.repository.DataTypeRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DataTypeServiceImpl implements DataTypeService{

    private DataTypeRepository dataTypeRepository;

    @Override
    public List<RLSDataTypePOSTAPISchema> getAllDataTypes() {
        return dataTypeRepository.findAll();
    }
    
}
