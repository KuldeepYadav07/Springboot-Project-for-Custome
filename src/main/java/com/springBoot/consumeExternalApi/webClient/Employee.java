package com.springBoot.consumeExternalApi.webClient;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Getter
@Setter
@Document
public class Employee {

    private int id;
    private String name;
    private String email;
    private String age;

}
