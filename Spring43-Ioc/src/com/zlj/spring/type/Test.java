package com.zlj.spring.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlj.spring.set.BoyPNameSpace;

public class Test {
	private static ApplicationContext cxt;
	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext("applicationContext-type.xml");
		DataType entity = (DataType) cxt.getBean("dataType");
		entity.printValue();

	}

}
