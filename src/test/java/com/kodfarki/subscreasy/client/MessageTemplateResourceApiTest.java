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
import com.kodfarki.subscreasy.client.model.MessageTemplate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageTemplateResourceApi
 */
@Ignore
public class MessageTemplateResourceApiTest {

    private final MessageTemplateResourceApi api = new MessageTemplateResourceApi();

    
    /**
     * createMessageTemplate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessageTemplateUsingPOSTTest() throws ApiException {
        MessageTemplate messageTemplate = null;
        MessageTemplate response = api.createMessageTemplateUsingPOST(messageTemplate);

        // TODO: test validations
    }
    
    /**
     * deleteMessageTemplate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMessageTemplateUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteMessageTemplateUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * getAllMessageTemplates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMessageTemplatesUsingGETTest() throws ApiException {
        List<MessageTemplate> response = api.getAllMessageTemplatesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getMessageTemplate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTemplateUsingGET1Test() throws ApiException {
        Long id = null;
        MessageTemplate response = api.getMessageTemplateUsingGET1(id);

        // TODO: test validations
    }
    
    /**
     * updateMessageTemplate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMessageTemplateUsingPUTTest() throws ApiException {
        MessageTemplate messageTemplate = null;
        MessageTemplate response = api.updateMessageTemplateUsingPUT(messageTemplate);

        // TODO: test validations
    }
    
}
