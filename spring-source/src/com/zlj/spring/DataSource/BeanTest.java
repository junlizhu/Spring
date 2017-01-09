package com.zlj.spring.DataSource;

import javax.sql.DataSource;
import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanTest
{
	public static void main(String[] args)
		throws Exception
	{
		// 实例化Spring容器。Spring容器负责实例化Bean
		ApplicationContext ctx =
			new ClassPathXmlApplicationContext("beans.xml");
		// 获取容器中id为dataSource的Bean
		DataSource ds = ctx.getBean("dataSource", DataSource.class);
		// 通过DataSource来获取数据库连接
		Connection conn = ds.getConnection();
		// 通过数据库连接获取PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into spring values(null , ? , ?)");
		pstmt.setString(1 , "疯狂Java联盟成立了");
		pstmt.setString(2 , "疯狂Java地址：www.crazyit.org");
		// 执行SQL语句
		pstmt.executeUpdate();
		// 清理资源，回收数据库连接资源。
		if (pstmt != null)pstmt.close();
		if (conn != null)conn.close();
	}
}