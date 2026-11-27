package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void addsTwoNumbers() {
    Calculator calculator = new Calculator();

    assertEquals(30, calculator.add(10, 20));
  }
}
