package org.openapitools.services;

import java.util.Optional;

import org.openapitools.model.SYSModel;

public interface SystemService {
    Optional<SYSModel> getSystem(Long systemId);
}
