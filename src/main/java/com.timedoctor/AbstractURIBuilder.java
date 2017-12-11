package com.timedoctor;

import org.apache.http.client.utils.URIBuilder;

public class AbstractURIBuilder extends URIBuilder {
    String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public AbstractURIBuilder addAccessToken(String access_token) {
        setAccess_token(access_token);
        this.addParameter("access_token", access_token);
        return this;
    }
}
