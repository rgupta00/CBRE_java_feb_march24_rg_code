package com.gateway.filter;

import com.gateway.util.JwtService;
import com.gateway.util.RouteExeptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Component
public class AuthenticationFilter  extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    @Autowired
    private RouteExeptions routeExeptions;

    @Autowired
    private JwtService jwtService;

    public AuthenticationFilter(){
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ( exchange,  chain)-> {
            String authHeader=null;
            if(routeExeptions.isSecured.test(exchange.getRequest())){
                    //header container token or not
                if(!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)){
                    throw new RuntimeException("missing header information");
                }
                 authHeader=exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                if(authHeader!=null && authHeader.startsWith("Bearer ")){
                    authHeader=authHeader.substring(7) ;
                }
            }
        //i can call auth server
                try{
                    jwtService.validateToken(authHeader);
                }catch (Exception e){
                    throw new RuntimeException("invalid token");
                }

                return chain.filter(exchange);

        };
    }

    public static class Config{
    }
}