package com.springBoot.consumeExternalApi.webClient;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo  extends MongoRepository<Employee , Integer>{

}
