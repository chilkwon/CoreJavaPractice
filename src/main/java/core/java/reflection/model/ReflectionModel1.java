package core.java.reflection.model;

import java.io.Serializable;
import java.util.Arrays;

public class ReflectionModel1 extends Object implements Serializable {

	private static final long serialVersionUID = -2693156947838409146L;

	public void method1() {
		System.out.println("ReflectionModel1.method1()");
	}

	public void method2(String name) {
		System.out.println("Hello: " + name);
	}

	public void method3(String[] names) {
		Arrays.stream(names).forEach(System.out::println);
	}

}