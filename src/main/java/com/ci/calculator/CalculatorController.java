package com.ci.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

  @Autowired
  private CalculatorEngine calculatorEngine;

  @GetMapping("/sum")
  public double sum(@RequestParam double a, @RequestParam double b) {
    return calculatorEngine.sum(a, b);
  }

}
