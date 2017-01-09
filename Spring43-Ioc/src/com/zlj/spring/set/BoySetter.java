package com.zlj.spring.set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlj.spring.auto.BoyAnnotation;

import lombok.Getter;
import lombok.Setter;


public class BoySetter {
	private static Logger logger = Logger.getLogger(BoySetter.class);
	@Setter@Getter
	private GirlFriend girlFriend;
	private static ApplicationContext cxt;

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext("applicationContext-set.xml");
		BoySetter boy = (BoySetter) cxt.getBean("boySetter");
		logger.info(boy.girlFriend.speak());

	}

}
