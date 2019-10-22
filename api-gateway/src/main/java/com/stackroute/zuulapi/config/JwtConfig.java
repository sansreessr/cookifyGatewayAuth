package com.stackroute.zuulapi.config;

import org.springframework.beans.factory.annotation.Value;

public class JwtConfig {

    //@Value("${security.jwt.uri:/auth/**}")
    private String Uri = "http://localhost:80801";

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${jwt.secret:JwtSecretKey}")
    private String secret;

    public String getUri() {
        return Uri;
    }

    public String getHeader() {
        return header;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSecret() {
        return secret;
    }
}
