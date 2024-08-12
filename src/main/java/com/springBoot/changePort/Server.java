package com.springBoot.changePort;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

public class Server implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    //1-> we can change the by write "server.port=7000" in application.properties file
    //2-> we can change Go to Run -> Edit Configurations ->SpringBootAppApplication-> VM options
    //3->
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(8081);
    }
}
