package com.kodfarki.subscreasy;

/**
 * User: Halil Karakose
 * Date: 2020-01-17
 * Time: 14:46
 */
public class ConfigurationSandbox {
    private static ApiClient sandboxApiClient;

    public static ApiClient getSandboxApiClient() {
        if (sandboxApiClient == null) {
            sandboxApiClient = new ApiClient();
            sandboxApiClient.setBasePath("https://sandbox.subscreasy.com");
        }

        return sandboxApiClient;
    }
}
