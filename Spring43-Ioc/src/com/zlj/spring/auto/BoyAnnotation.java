package com.zlj.spring.auto;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/*@Component("boyAnnotation")给组件取个名字
  @Autowired 注入属性，可以放在属性或者Setter方法上面byType自动注入
  @Resource 注入属性，可以放在属性或者Setter方法上面
			属性name解析bean的名字，type解析bean的类型，byName自动注入
  @Repository dao层bean（持久层）
			singleton  单利，共享bean
			prototype  注入新的属性
			request    http request 有效（一个请求一个新的bean）
			session    http ression 有效（一个请求一个新的bean）
			global  session  portlet web 有效 全局session
  @author  win*/

@Component("boyAnnotation")
public class BoyAnnotation {
	private static Logger logger = Logger.getLogger(BoyAnnotation.class);
	private UsaGirlFriend usaGirlFriend;
	private static ApplicationContext cxt;
	
	public UsaGirlFriend getUsaGirlFriend(){
		return usaGirlFriend;
	}
	@Resource(name="usaGirlFriend")
	public  void setUsaGirlFriend(UsaGirlFriend usaGirlFriend) {
		this.usaGirlFriend = usaGirlFriend;
	}
	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext("applicationContext-auto.xml");
		BoyAnnotation boy = (BoyAnnotation) cxt.getBean("boyAnnotation");
		logger.info(boy.usaGirlFriend.speak());

	}

}
