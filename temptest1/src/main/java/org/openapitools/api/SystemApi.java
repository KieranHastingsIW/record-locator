/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.RLSSYSTEMPOSTAPISchema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@Validated
@Tag(name = "system", description = "the system API")
public interface SystemApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /system : Retriev all systems
     *
     * @return OK (status code 200)
     *         or bad request (status code 400)
     */
    @Operation(
        operationId = "systemGet",
        summary = "Retriev all systems",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RLSSYSTEMPOSTAPISchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "bad request")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/system",
        produces = { "application/json" }
    )
    default ResponseEntity<List<RLSSYSTEMPOSTAPISchema>> systemGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"loc_type\" : \"loc_type\", \"location\" : \"location\", \"sys_type\" : \"sys_type\", \"third_party_id\" : \"third_party_id\", \"source_sys\" : \"source_sys\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /system : Insert system
     *
     * @param rlSSYSTEMPOSTAPISchema  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "systemPost",
        summary = "Insert system",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/system",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> systemPost(
        @Parameter(name = "RLSSYSTEMPOSTAPISchema", description = "", required = true) @Valid @RequestBody RLSSYSTEMPOSTAPISchema rlSSYSTEMPOSTAPISchema
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
