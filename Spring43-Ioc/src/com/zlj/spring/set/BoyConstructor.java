package com.zlj.spring.set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoyConstructor {
	private static Logger logger = Logger.getLogger(BoyConstructor.class);
	
	private GirlFriend girlFriend;
	private static ApplicationContext cxt;
	public BoyConstructor(){
		
	}
	
	public BoyConstructor(GirlFriend girlFriend){
		this.girlFriend = girlFriend;
	}

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext("applicationContext-set.xml");
		BoyConstructor boy = (BoyConstructor) cxt.getBean("boyConstructor");
		logger.info(boy.girlFriend.speak());
	}

}
