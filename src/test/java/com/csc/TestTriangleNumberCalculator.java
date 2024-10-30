package com.csc;
import java.util.List;

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
   @Test
   void TriangleNumberCalculator1(){
    assertEquals(calculator.value(10),55);
  }
  @Test
  void TriangleNumberCalculator2(){
    assertEquals(calculator.value(2),3);
  }
  @Test
  void TriangleNumberCalculator3(){
    assertEquals(calculator.value(0),0);
  }
  @Test
  void TriangleNumberCalculatoradd1(){
    assertEquals(calculator.add(1,1),2);
  }
  @Test
  void TriangleNumberCalculatoradd2(){
    assertEquals(calculator.add(2,3),9);
  }
  @Test
  void TriangleNumberCalculatoradd3(){
    assertEquals(calculator.add(4,2),13);
  }
  @Test
  void TriangleNumberCalculatorsub1(){
    assertEquals(calculator.subtract(1, 1),0);
  }
  @Test
  void TriangleNumberCalculatorsub2(){
    assertEquals(calculator.subtract(2, 3),-3);
  }
  @Test
  void TriangleNumberCalculatorsub3(){
    assertEquals(calculator.subtract(4,2),7);
  }


  // new test for Add-Ons For the Portfolio (all of the credits)
  @Test
  void TriangleNumberCalculatormult1(){
    assertEquals(calculator.multiply(4,2),30);
  }
  @Test
  void TriangleNumberCalculatormult2(){
    assertEquals(calculator.multiply(5, 3),90);
  }
  @Test
  void TriangleNumberCalculatordiv1(){
    assertEquals(calculator.divide(4, 2),3.33);
  }
  @Test
  void TriangleNumberCalculatordiv2(){
    assertEquals(calculator.divide(5, 3),2.5);
  }
 @Test 
 void SequenceTest1()
 {
  List <Integer> proof = List.of(1,3,6);
  assertEquals(calculator.sequence(3),proof );
 }
 @Test 
 void SequenceTest2()
 {
  List <Integer> proof1 = List.of(1,3,6,10,15,21,28,36,45,55);
  assertEquals(calculator.sequence(10),proof1);
 }






}
