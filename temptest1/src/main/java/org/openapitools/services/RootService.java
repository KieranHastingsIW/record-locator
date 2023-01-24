package org.openapitools.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.openapitools.model.RLModel;

public interface RootService {
    List<RLModel> getLocations(String patientid, @Valid Optional<Long> datatype);
    RLModel createRecord(RLModel recorLocation);
}
