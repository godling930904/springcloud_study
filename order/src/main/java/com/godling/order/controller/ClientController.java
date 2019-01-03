package com.godling.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 21:44
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getProductMsg")
    public String getProductMsg() {
//        RestTemplate restTemplate = new RestTemplate();
        //第一种方式(直接使用restTemplate,url写死)
//        String result = restTemplate.getForObject("http://localhost:8888/msg", String.class);
//        log.info("response={}",result);

        //第二种方式,获取远程负载均衡器的方法(通过应用名获取url,port后使用restTemplate)
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String host = serviceInstance.getHost();
//        int port = serviceInstance.getPort();
//        String url = String.format("http://%s:%s/msg", host, port);
//        log.info("this is ={}",url);
//        String result = restTemplate.getForObject(url, String.class);
//        log.info("response={}",result);

        //第三种方式(将RestTemplate使用LoadBalanced注解后注入,可在restTemplate中直接使用应用名)
        String result = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        log.info("response={}", result);
        return result;
    }
}
