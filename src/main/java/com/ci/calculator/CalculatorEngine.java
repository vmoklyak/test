package com.ci.calculator;


import org.springframework.stereotype.Component;

@Component
public class CalculatorEngine {

  public double sum(double a, double b) {
    return a + b;
  }

}
