package com.springbook.biz.user;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Srping �����̳ʷκ��� UserServiceImpl ��ü�� Lookup�Ѵ�.
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. �� ��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("tom");
		vo.setPassword("1111");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		// 4. Spring �����̳� ����
		container.close();

	}

}