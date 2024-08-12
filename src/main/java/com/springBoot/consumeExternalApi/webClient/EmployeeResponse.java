package com.springBoot.consumeExternalApi.webClient;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeResponse {
    private int id;
    private String name;
    private String email;
    private String age;
    private AddressResponse addressResponse ;
}
