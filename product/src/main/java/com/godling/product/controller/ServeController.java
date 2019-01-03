package com.godling.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 21:40
 */
@RestController
public class ServeController {

    @GetMapping("msg")
    public String msg(){
        return "这个其实就是方法~";
    }

}
