package com.ci.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorEngineTest {

  private CalculatorEngine sut;

  @BeforeEach
  public void before() {
    sut = new CalculatorEngine();
  }

  @Test
  public void shouldSum() {
    // Given
    final double a = 10.9D;
    final double b = 10.2D;

    // When
    final double result = sut.sum(a, b);

    // Then
    Assertions.assertEquals(21.2, result);
  }

}