package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

   @Test
   void TriangleNumberCalculator(){
     assertEquals(calculator.value(4),10);
   }
   void TriangleNumberCalculator1(){
    assertEquals(calculator.value(10),55);
  }
  void TriangleNumberCalculator2(){
    assertEquals(calculator.value(2),3);
  }
  void TriangleNumberCalculator3(){
    assertEquals(calculator.value(0),0);
  }
  void TriangleNumberCalculatoradd1(){
    assertEquals(calculator.add(1,1),2);
  }
  void TriangleNumberCalculatoradd2(){
    assertEquals(calculator.add(2,3),9);
  }
  void TriangleNumberCalculatoradd3(){
    assertEquals(calculator.add(4,2),13);
  }
  void TriangleNumberCalculatorsub1(){
    assertEquals(calculator.subtract(1, 1),0);
  }
  void TriangleNumberCalculatorsub2(){
    assertEquals(calculator.subtract(2, 3),-3);
  }
  void TriangleNumberCalculatorsub3(){
    assertEquals(calculator.subtract(4,2),7);
  }

}
