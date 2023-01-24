package org.openapitools.api;

import org.openapitools.model.RLModel;

import org.openapitools.services.RootService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@AllArgsConstructor
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@RestController
@RequestMapping("${openapi.recordLocator.base-path:/rls}")
public class DefaultApiController implements DefaultApi {

    private final NativeWebRequest request;

    private RootService rootService;


    
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<RLModel>> rootGet(String patientid,Optional<Long> datatype){
        return new ResponseEntity<>(rootService.getLocations(patientid,datatype), HttpStatus.OK);
    }

    @Override 
    public ResponseEntity<RLModel> rootPost(RLModel rlSPOSTAPISchema){
        RLModel recordLocation = rootService.createRecord(rlSPOSTAPISchema);
        return new ResponseEntity<>(recordLocation,HttpStatus.CREATED);
    }
}
