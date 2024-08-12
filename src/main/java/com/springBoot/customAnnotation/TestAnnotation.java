package com.springBoot.customAnnotation;


import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    String Developer() default "";
    String Expirydate() default "";

}
