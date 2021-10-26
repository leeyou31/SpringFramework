package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser { // this is the client...

	public static void main(String[] args) { // this operates the container...
	
		
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		//2. Spring�����̳ʷκ��� �ʿ��� ��ü�� ��û(lookup)�Ѵ�.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	
		//3. Spring �����̳ʸ� �����Ѵ�.
		factory.close();
	}

}
