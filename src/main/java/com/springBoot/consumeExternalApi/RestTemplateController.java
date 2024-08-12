package com.springBoot.consumeExternalApi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello ";
    }


    @GetMapping("/callAnotherClient")
    private String getHelloClient(){
        String uri="/http://localhost:8080/hello";
        RestTemplate restTemplate= new RestTemplate();
        String result= restTemplate.getForObject(uri,String.class);
        return result;
    }
}
