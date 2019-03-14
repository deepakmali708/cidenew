package com.qaagility.controller;

import com.qaagility.javaee.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class CalcTest {

	@Test
public void testSlow() {
        System.out.println("slow");
      }

      @Test
	public void testSlower() {
        System.out.println("slower");
      }

      @Test
	public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	@Test	
      public void Test111() {
Calcmul pp=new Calcmul();
int res=pp.mul();
        assertEquals("Result - Fail", 18, res);
      }
	@Test	
      public void Test1111() {
Calculator pp1=new Calculator();
int res1=pp1.add();
        assertEquals("Result - Fail", 9, res1);
      }
	
    }
