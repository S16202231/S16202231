package com.wyp.maven.maven_demo1;

import com.wyp.maven.maven_demo1.Caculate;
import org.junit.Test;

public class CaculateTest {
	@Test
	public void plusTest() {
		Caculate caculate = new Caculate();
		System.out.println(caculate.plus(3, 2));
	}

	@Test
	public void minusTest() {
		Caculate caculate = new Caculate();
		System.out.println(caculate.minus(3, 2));
	}
}