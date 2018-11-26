/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 1.2.37
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.api;

import com.swift.ApiException;
import com.swift.model.CamtA0500102;
import com.swift.model.CamtA0500202;
import com.swift.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetInvalidEventsApi
 */
@Ignore
public class GetInvalidEventsApiTest {

    private final GetInvalidEventsApi api = new GetInvalidEventsApi();

    
    /**
     * Get Invalid Events
     *
     * This API is a payment events&#39; query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvalidEventsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0500102 requestBody = null;
        String xRecord = null;
        CamtA0500202 response = api.getInvalidEventsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);

        // TODO: test validations
    }
    
}
