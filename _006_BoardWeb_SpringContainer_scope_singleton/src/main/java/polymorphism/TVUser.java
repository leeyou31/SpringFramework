package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser { // this is the client...

	public static void main(String[] args) { // this operates the container...
	
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		//2. Spring�����̳ʷκ��� �ʿ��� ��ü�� ��û(lookup)�Ѵ�.
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
	
		//3. Spring �����̳ʸ� �����Ѵ�.
//		factory.close();
	}

}