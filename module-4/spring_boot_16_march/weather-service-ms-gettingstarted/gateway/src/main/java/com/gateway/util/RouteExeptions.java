package com.gateway.util;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteExeptions {
    public static final List<String> endPoints=
            List.of("/authserver/validate",
            "/authserver/authenticate",
            "/authserver/register","/eureka");

    //Predicate is a funcational interface in java 8 what it does
    //if req if notmataching of any of abouve url then retrun true
    public Predicate<ServerHttpRequest> isSecured=
             req-> endPoints.stream()
                     .noneMatch(uri->req.getURI().getPath().contains(uri));
}
