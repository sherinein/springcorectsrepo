package com.junit4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CalculatorTest {
	Calculator cal;
	int expected;
	int input1;
	int input2;
	public CalculatorTest(int expected,int input1,int input2) {
		this.expected=expected;
		this.input1=input1;
		this.input2=input2;
	}
	@Before
	public void init() {
		cal=new Calculator();
	}
	@Parameters
	public static Collection<Object[]> testParmeter(){
		Object[][] object=new Object[][] {
			{4,2,2},{5,5,3},{10,6,4}
		};
		return Arrays.asList(object);
	}
	@Test
	public void testAdd() {
		assertEquals(expected,cal.add(input1, input2));
	}
	@After
	public void destroy() {
		cal=null;
	}

}
