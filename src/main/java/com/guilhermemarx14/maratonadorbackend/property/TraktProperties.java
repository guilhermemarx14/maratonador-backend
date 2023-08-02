package com.guilhermemarx14.maratonadorbackend.property;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TraktProperties {
    private String baseUrl;
    private String clientId;
    private String clientSecret;
    private String redirectUri;
}
