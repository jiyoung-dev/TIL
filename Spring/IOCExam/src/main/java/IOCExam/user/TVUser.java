package IOCExam.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import IOCExam.tv.TV;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// ApplicationContext는 인터페이스이다
		// xml파일 생성해서 공장에 넣어줘야함 
		// src폴더안에 있는 파일들만 경로가 ClassPath이다 -> src폴더에 resource라는 폴더 생성함
		
		// xml에 있는 객체를 가져와 사용하면 된다!
		TV tv = factory.getBean("one", TV.class);
		
		tv.turnOn();
		tv.turnOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}
}
