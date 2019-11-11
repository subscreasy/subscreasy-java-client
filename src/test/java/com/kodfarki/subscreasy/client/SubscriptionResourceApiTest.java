/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kodfarki.subscreasy.client;

import com.kodfarki.subscreasy.ApiException;
import com.kodfarki.subscreasy.client.model.Cancellation;
import com.kodfarki.subscreasy.client.model.StartSubscriptionRequest;
import com.kodfarki.subscreasy.client.model.StartSubscriptionResult;
import com.kodfarki.subscreasy.client.model.Subsription;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionResourceApi
 */
@Ignore
public class SubscriptionResourceApiTest {

    private final SubscriptionResourceApi api = new SubscriptionResourceApi();

    
    /**
     * cancelSubscription
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelSubscriptionUsingPUTTest() throws ApiException {
        Cancellation cancellation = null;
        Subsription response = api.cancelSubscriptionUsingPUT(cancellation);

        // TODO: test validations
    }
    
    /**
     * getActiveSubscriptionsByEmail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveSubscriptionsByEmailUsingGETTest() throws ApiException {
        String email = null;
        List<Subsription> response = api.getActiveSubscriptionsByEmailUsingGET(email);

        // TODO: test validations
    }
    
    /**
     * getActiveSubscriptions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveSubscriptionsUsingGETTest() throws ApiException {
        String secureId = null;
        List<Subsription> response = api.getActiveSubscriptionsUsingGET(secureId);

        // TODO: test validations
    }
    
    /**
     * getAllCompanySubscriptions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCompanySubscriptionsUsingGETTest() throws ApiException {
        String id = null;
        List<Subsription> response = api.getAllCompanySubscriptionsUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * getSubscription
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionUsingGETTest() throws ApiException {
        Long id = null;
        Subsription response = api.getSubscriptionUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * startSubscription
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startSubscriptionUsingPOSTTest() throws ApiException {
        StartSubscriptionRequest request = null;
        StartSubscriptionResult response = api.startSubscriptionUsingPOST(request);

        // TODO: test validations
    }
    
}