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
import com.kodfarki.subscreasy.client.model.SavedCard;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SavedCardResourceApi
 */
@Ignore
public class SavedCardResourceApiTest {

    private final SavedCardResourceApi api = new SavedCardResourceApi();

    
    /**
     * createCard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardUsingPOSTTest() throws ApiException {
        SavedCard card = null;
        SavedCard response = api.createCardUsingPOST(card);

        // TODO: test validations
    }
    
    /**
     * deleteCard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCardUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteCardUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * getAllCards
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCardsUsingGETTest() throws ApiException {
        List<SavedCard> response = api.getAllCardsUsingGET();

        // TODO: test validations
    }
    
    /**
     * getCard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardUsingGETTest() throws ApiException {
        Long id = null;
        SavedCard response = api.getCardUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * updateCard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCardUsingPUTTest() throws ApiException {
        SavedCard card = null;
        SavedCard response = api.updateCardUsingPUT(card);

        // TODO: test validations
    }
    
}
