package com.springBoot.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Violation {

    private final String fieldName;

    private final String message;
}
