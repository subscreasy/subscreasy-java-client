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
import com.kodfarki.subscreasy.client.model.Subscriber;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriberResourceApi
 */
@Ignore
public class SubscriberResourceApiTest {

    private final SubscriberResourceApi api = new SubscriberResourceApi();

    
    /**
     * createSubscriber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubscriberUsingPOSTTest() throws ApiException {
        Subscriber subscriber = null;
        Subscriber response = api.createSubscriberUsingPOST(subscriber);

        // TODO: test validations
    }
    
    /**
     * deleteSubscriber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubscriberUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteSubscriberUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * getAllSubscribers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSubscribersUsingGETTest() throws ApiException {
        List<Subscriber> response = api.getAllSubscribersUsingGET();

        // TODO: test validations
    }
    
    /**
     * getSubscriberByEmail
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriberByEmailUsingGETTest() throws ApiException {
        String email = null;
        List<Subscriber> response = api.getSubscriberByEmailUsingGET(email);

        // TODO: test validations
    }
    
    /**
     * getSubscriberByName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriberByNameUsingGETTest() throws ApiException {
        String name = null;
        List<Subscriber> response = api.getSubscriberByNameUsingGET(name);

        // TODO: test validations
    }
    
    /**
     * getSubscriber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriberUsingGETTest() throws ApiException {
        Long id = null;
        Subscriber response = api.getSubscriberUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * updateSubscriber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubscriberUsingPUTTest() throws ApiException {
        Subscriber subscriber = null;
        Subscriber response = api.updateSubscriberUsingPUT(subscriber);

        // TODO: test validations
    }
    
}
