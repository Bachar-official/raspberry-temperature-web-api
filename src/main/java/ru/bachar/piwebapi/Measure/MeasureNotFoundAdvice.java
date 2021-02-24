package ru.bachar.piwebapi.Measure;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MeasureNotFoundAdvice {    
    @ResponseBody
  @ExceptionHandler(MeasureNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(MeasureNotFoundException ex) {
    return ex.getMessage();
  }
}
