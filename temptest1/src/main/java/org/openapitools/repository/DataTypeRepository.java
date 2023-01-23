package org.openapitools.repository;

import org.openapitools.model.RLSDataTypePOSTAPISchema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataTypeRepository extends JpaRepository<RLSDataTypePOSTAPISchema, Long>{
    
}
