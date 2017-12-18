package com.timedoctor;

import org.apache.http.client.utils.URIBuilder;

public class AbstractURIBuilder extends URIBuilder {
    private String access_token;

    public AbstractURIBuilder addAccessToken(String access_token) {
        this.addParameter("access_token", access_token);
        return this;
    }
}
