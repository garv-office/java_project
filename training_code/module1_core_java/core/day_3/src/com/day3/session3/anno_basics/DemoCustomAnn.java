package com.day3.session3.anno_basics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//1. make a anno
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	public String data() default "my data";
}

//2. apply the anno
class MyClient {
	@MyAnno(data = "sunlife data")
	final public void foo() {
		System.out.println("hello to foo");
	}
}

//3. process the annotation=> "Java reflection"
public class DemoCustomAnn {

	public static void main(String[] args) throws ClassNotFoundException {
		// how to get meta data of the class
		// Class
		Class<?> clazz = Class.forName("com.day3.session3.anno_basics.MyClient");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			// System.out.println(method.getName()+": "+
			// Modifier.toString(method.getModifiers()));
			if (method.isAnnotationPresent(MyAnno.class)) {
				MyAnno anno = method.getAnnotation(MyAnno.class);
				System.out.println(anno.data());
			}
		}

	}

}
