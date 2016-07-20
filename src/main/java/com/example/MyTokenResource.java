package com.example;

import com.barclase.api.model.Json178691418;
import com.barclase.api.resource.TokenResource;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

/**
 * Created by willemveelenturf on 20/07/16.
 */
public class MyTokenResource implements TokenResource {

    @java.lang.Override
    public TokenResource.GetTokenResponse getToken(String token, String duration) throws Exception {

        System.out.println("Hit API");
        Json178691418 t = new Json178691418();

        TokenResource.GetTokenResponse res = TokenResource.GetTokenResponse.withJsonOK(t);

        return res;
    }
}
