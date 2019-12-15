/*
 * Authentication api
 * An API for authentication
 *
 * The version of the OpenAPI document: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ch.heigvd.amt.gestioncours.api;

import ch.heigvd.amt.gestioncours.ApiCallback;
import ch.heigvd.amt.gestioncours.ApiClient;
import ch.heigvd.amt.gestioncours.ApiException;
import ch.heigvd.amt.gestioncours.ApiResponse;
import ch.heigvd.amt.gestioncours.Configuration;
import ch.heigvd.amt.gestioncours.Pair;
import ch.heigvd.amt.gestioncours.ProgressRequestBody;
import ch.heigvd.amt.gestioncours.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ch.heigvd.amt.gestioncours.dto.Enrollment;
import ch.heigvd.amt.gestioncours.dto.EnrollmentList;
import ch.heigvd.amt.gestioncours.dto.Subject;
import ch.heigvd.amt.gestioncours.dto.SubjectList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createEnrollment
     * @param enrollment  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEnrollmentCall(Enrollment enrollment, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = enrollment;

        // create path and map variables
        String localVarPath = "/enrollments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createEnrollmentValidateBeforeCall(Enrollment enrollment, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'enrollment' is set
        if (enrollment == null) {
            throw new ApiException("Missing the required parameter 'enrollment' when calling createEnrollment(Async)");
        }
        

        okhttp3.Call localVarCall = createEnrollmentCall(enrollment, _callback);
        return localVarCall;

    }

    /**
     * 
     * create an Enrollment
     * @param enrollment  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public void createEnrollment(Enrollment enrollment) throws ApiException {
        createEnrollmentWithHttpInfo(enrollment);
    }

    /**
     * 
     * create an Enrollment
     * @param enrollment  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createEnrollmentWithHttpInfo(Enrollment enrollment) throws ApiException {
        okhttp3.Call localVarCall = createEnrollmentValidateBeforeCall(enrollment, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * create an Enrollment
     * @param enrollment  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEnrollmentAsync(Enrollment enrollment, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEnrollmentValidateBeforeCall(enrollment, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for createSubject
     * @param subject  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSubjectCall(Subject subject, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = subject;

        // create path and map variables
        String localVarPath = "/subjects";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSubjectValidateBeforeCall(Subject subject, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'subject' is set
        if (subject == null) {
            throw new ApiException("Missing the required parameter 'subject' when calling createSubject(Async)");
        }
        

        okhttp3.Call localVarCall = createSubjectCall(subject, _callback);
        return localVarCall;

    }

    /**
     * 
     * create a subject
     * @param subject  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public void createSubject(Subject subject) throws ApiException {
        createSubjectWithHttpInfo(subject);
    }

    /**
     * 
     * create a subject
     * @param subject  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createSubjectWithHttpInfo(Subject subject) throws ApiException {
        okhttp3.Call localVarCall = createSubjectValidateBeforeCall(subject, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * create a subject
     * @param subject  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSubjectAsync(Subject subject, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSubjectValidateBeforeCall(subject, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEnrollments
     * @param allEnrollemnts  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnrollmentsCall(List<EnrollmentList> allEnrollemnts, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enrollments"
            .replaceAll("\\{" + "allEnrollemnts" + "\\}", localVarApiClient.escapeString(localVarApiClient.collectionPathParameterToString("csv", allEnrollemnts)));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEnrollmentsValidateBeforeCall(List<EnrollmentList> allEnrollemnts, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'allEnrollemnts' is set
        if (allEnrollemnts == null) {
            throw new ApiException("Missing the required parameter 'allEnrollemnts' when calling getEnrollments(Async)");
        }
        

        okhttp3.Call localVarCall = getEnrollmentsCall(allEnrollemnts, _callback);
        return localVarCall;

    }

    /**
     * 
     * get the list of all enrollments
     * @param allEnrollemnts  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void getEnrollments(List<EnrollmentList> allEnrollemnts) throws ApiException {
        getEnrollmentsWithHttpInfo(allEnrollemnts);
    }

    /**
     * 
     * get the list of all enrollments
     * @param allEnrollemnts  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getEnrollmentsWithHttpInfo(List<EnrollmentList> allEnrollemnts) throws ApiException {
        okhttp3.Call localVarCall = getEnrollmentsValidateBeforeCall(allEnrollemnts, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * get the list of all enrollments
     * @param allEnrollemnts  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnrollmentsAsync(List<EnrollmentList> allEnrollemnts, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEnrollmentsValidateBeforeCall(allEnrollemnts, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSubjects
     * @param allSujects  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubjectsCall(List<SubjectList> allSujects, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subjects"
            .replaceAll("\\{" + "allSujects" + "\\}", localVarApiClient.escapeString(localVarApiClient.collectionPathParameterToString("csv", allSujects)));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSubjectsValidateBeforeCall(List<SubjectList> allSujects, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'allSujects' is set
        if (allSujects == null) {
            throw new ApiException("Missing the required parameter 'allSujects' when calling getSubjects(Async)");
        }
        

        okhttp3.Call localVarCall = getSubjectsCall(allSujects, _callback);
        return localVarCall;

    }

    /**
     * 
     * get the list of all subjects
     * @param allSujects  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public void getSubjects(List<SubjectList> allSujects) throws ApiException {
        getSubjectsWithHttpInfo(allSujects);
    }

    /**
     * 
     * get the list of all subjects
     * @param allSujects  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getSubjectsWithHttpInfo(List<SubjectList> allSujects) throws ApiException {
        okhttp3.Call localVarCall = getSubjectsValidateBeforeCall(allSujects, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * get the list of all subjects
     * @param allSujects  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubjectsAsync(List<SubjectList> allSujects, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSubjectsValidateBeforeCall(allSujects, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
