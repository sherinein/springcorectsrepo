package com.test.junit4;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class AnnotationTest {
	ArrayList<String> list;
	@Before
	public void init() {
		list=new ArrayList<String>();
	}
	@Test
	public void test() {
		list.add("test");
		assertEquals(1, list.size());

	}
}
