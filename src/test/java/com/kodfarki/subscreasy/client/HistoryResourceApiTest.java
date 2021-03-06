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
import com.kodfarki.subscreasy.client.model.History;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoryResourceApi
 */
@Ignore
public class HistoryResourceApiTest {

    private final HistoryResourceApi api = new HistoryResourceApi();

    
    /**
     * createHistory
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHistoryUsingPOSTTest() throws ApiException {
        History history = null;
        History response = api.createHistoryUsingPOST(history);

        // TODO: test validations
    }
    
    /**
     * deleteHistory
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHistoryUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteHistoryUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * getAllHistories
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllHistoriesUsingGETTest() throws ApiException {
        List<History> response = api.getAllHistoriesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getHistory
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoryUsingGETTest() throws ApiException {
        Long id = null;
        History response = api.getHistoryUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * updateHistory
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHistoryUsingPUTTest() throws ApiException {
        History history = null;
        History response = api.updateHistoryUsingPUT(history);

        // TODO: test validations
    }
    
}
