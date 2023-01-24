/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.RLModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
@Validated
@Tag(name = "default", description = "the default API")
public interface DefaultApi {

    
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET / : Retrieve locations
     *
     * @param patientid NHI Number (required)
     * @param datatype Datatype key (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     */
    @Operation(
        operationId = "rootGet",
        summary = "Retrieve locations",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = List.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/",
        produces = { "application/json" }
    )
    default ResponseEntity<List<RLModel>> rootGet(
        @NotNull @Parameter(name = "patientid", description = "NHI Number", required = true) @Valid @RequestParam(value = "patientid", required = true) String patientid,
        @Parameter(name = "datatype", description = "Datatype key") @Valid @RequestParam(value = "datatype", required = false) Optional<Long> datatype
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
     * POST / : Insert or update locations
     *
     * @param rlSPOSTAPISchema  (required)
     * @return Created (status code 201)
     */
    @Operation(
        operationId = "rootPost",
        summary = "Insert or update locations",
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RLModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<RLModel> rootPost(
        @Parameter(name = "RLSPOSTAPISchema", description = "", required = true) @Valid @RequestBody RLModel rlSPOSTAPISchema
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

}