package com.godling.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 22:06
 */
@Component
public class RestTemplateConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
