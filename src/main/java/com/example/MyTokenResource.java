package com.example;

import com.barclase.api.model.Token;
import com.barclase.api.resource.TokensResource;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

/**
 * Created by willemveelenturf on 20/07/16.
 */
public class MyTokenResource implements TokensResource {


    @Override
    public PostTokensResponse postTokens(Token entity) throws Exception {

        Token t = new Token();
        t.setCustomerId("123");

        return TokensResource.PostTokensResponse.withJsonOK(t);

    }
}
