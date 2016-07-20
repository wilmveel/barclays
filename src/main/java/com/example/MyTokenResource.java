package com.example;

import com.barclase.api.resource.TokenResource;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

/**
 * Created by willemveelenturf on 20/07/16.
 */
public class MyTokenResource implements TokenResource {

    @java.lang.Override
    public TokenResource.GetTokenResponse getToken(String token, String duration) throws Exception {


        StreamingOutput stream = new StreamingOutput() {
            @Override
            public void write(OutputStream os) throws IOException,
                    WebApplicationException {
                Writer writer = new BufferedWriter(new OutputStreamWriter(os));
                writer.write("test");
                writer.flush();
            }
        };
        System.out.println("Hit API");
        StreamingOutput out = null;
        TokenResource.GetTokenResponse res = TokenResource.GetTokenResponse.withJsonOK(stream);

        return res;
    }
}
