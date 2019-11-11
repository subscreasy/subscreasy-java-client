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
import com.kodfarki.subscreasy.client.model.ResponseEntity;
import com.kodfarki.subscreasy.client.model.UserDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountResourceApi
 */
@Ignore
public class AccountResourceApiTest {

    private final AccountResourceApi api = new AccountResourceApi();

    
    /**
     * isAuthenticated
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isAuthenticatedUsingGETTest() throws ApiException {
        String response = api.isAuthenticatedUsingGET();

        // TODO: test validations
    }
    
    /**
     * registerAccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerAccountUsingPOSTTest() throws ApiException {
        UserDTO managedUserVM = null;
        ResponseEntity response = api.registerAccountUsingPOST(managedUserVM);

        // TODO: test validations
    }
    
}