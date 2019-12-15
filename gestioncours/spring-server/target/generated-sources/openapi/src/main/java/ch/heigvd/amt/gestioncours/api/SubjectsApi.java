/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.heigvd.amt.gestioncours.api;

import ch.heigvd.amt.gestioncours.api.model.Subject;
import ch.heigvd.amt.gestioncours.api.model.SubjectList;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-15T21:22:24.651+01:00[Europe/Berlin]")

@Validated
@Api(value = "subjects", description = "the subjects API")
public interface SubjectsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createSubject", notes = "create a subject", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created"),
        @ApiResponse(code = 401, message = "unexpected error"),
        @ApiResponse(code = 403, message = "forbidden"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/subjects",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createSubject(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Subject subject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getSubjects", notes = "get the list of all subjects", response = SubjectList.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = SubjectList.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "unexpected error") })
    @RequestMapping(value = "/subjects",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<SubjectList>> getSubjects() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
