package com.zlj.spring;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {
	//定义name address memo 属性，属性的值将通过spring的框架进行设置
	private String name;
	private String address;
	private String memo;
     // get set 方法由lombok生成
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", memo=" + memo + "]";
	}

    
}
