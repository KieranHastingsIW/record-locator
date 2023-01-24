package org.openapitools.services;

import java.util.List;
import java.util.Optional;

import org.openapitools.model.DTModel;

public interface DataTypeService {
    List<DTModel> getAllDataTypes();
    DTModel createDataType(DTModel dataType);
    public Optional<DTModel> getDataType(Long dataTypeId);
}
