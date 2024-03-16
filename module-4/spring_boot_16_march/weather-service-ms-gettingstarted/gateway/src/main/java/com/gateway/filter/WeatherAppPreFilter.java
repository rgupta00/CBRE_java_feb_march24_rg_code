package com.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Service;

@Service
public class WeatherAppPreFilter extends AbstractGatewayFilterFactory<WeatherAppPreFilter.Config> {

    public WeatherAppPreFilter(){
        super(Config.class);
    }
    @Override
    public GatewayFilter apply(Config config) {
        return ( exchange,  chain)-> {
                System.out.printf("*****WeatherAppPreFilter******");
            var requestWithHeader= exchange.getRequest().mutate()
                    .header("myheader","this is some sec token")
                    .build();
                return chain.filter(exchange.mutate().request(requestWithHeader).build());
        };
    }

    public static class Config{
    }
}