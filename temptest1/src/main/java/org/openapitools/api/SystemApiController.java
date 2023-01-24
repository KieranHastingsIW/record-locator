package org.openapitools.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@RestController
@RequestMapping("${openapi.recordLocator.base-path:/rls}")
public class SystemApiController implements SystemApi {

    private final NativeWebRequest request;

    @Autowired
    public SystemApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
