package com.springBoot.validation;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
class ValidateGivenParametersByController {

    @GetMapping("/validatePathVariable/{id}")
    ResponseEntity<String> validatePathVariable(@PathVariable("id") @Min(5) int id) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/validateRequestParameterWithMin")
    ResponseEntity<String> validateRequestParameterWithMin(@RequestParam("id") @Min(0) int id) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/validateRequestParameterWithMax")
    ResponseEntity<String> validateRequestParameterWithMax(@RequestParam("id") @Max(5) int id) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/validateRequestParameterWithEmailId")
    ResponseEntity<String> validateRequestParameterWithEmailId( @RequestParam(name = "emailId")  String emailId) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/validateRequestParameterWithPositive")
    ResponseEntity<String> validateRequestParameterWithPositive(@Positive @RequestParam(name = "id")  int id) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/validateRequestParameterWithNegativeOrZero")
    ResponseEntity<String> validateRequestParameterWithNegativeOrZero(@NegativeOrZero @RequestParam(name = "id")  int id) {
        return ResponseEntity.ok("valid");
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    String handleConstraintViolationException(ConstraintViolationException e) {
        return "Given input is not valid due to validation error: " + e.getMessage();
    }

}