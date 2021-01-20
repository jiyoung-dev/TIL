# [Spring] IoC/DI  
스프링 공부 1일차!     

IoC와 DI가 무엇인지, 간단한 예제와 함께 정리해보자  
먼저, IoC를 이해하기 전에 '컨테이너'란 무엇인지 알아야한다.  

## 컨테이너?
컨테이너는 Servlet 컨테이너부터 익숙했던 용어인데, 인스턴스의 생명주기를 관리하는 역할이다.  
객체의 생성과 소멸까지 부분을 전담해준다.  

## IoC  
'Inversion of Control'  
일반적으로, 개발자가 프로그램의 흐름을 제어하기 위해 코드를 작성하는데(객체를 직접 생성하는 등) 이 흐름을 개발자가 하는게 아니라  
프로그램이 직접 제어하는 것을 IoC라고 부른다. 스프링이 바로 IoC기반으로 만들어진 프레임워크이고, 스프링에서 객체를 생성하고,  
제어하고, 소멸까지 담당하는 것이 컨테이너다!!  
IoC에 대해 찾아보면 그대로 번역해서 제어의 역전이다,, 라고 하는데 객체를 직접 생성하지 않아도된다! 일단 이렇게 이해했다.  

## DI
DI는 의존성 주입이라고 생각하면 된다. 객체를 직접 생성하는게 아니라, 외부에서 생성한 후에 주입시켜주는 방식이다.  
DI를 사용하면 모듈간의 결합도가 낮아지고, 유연성이 높아진다는 장점이 있다. 이때 외부에서 생성된 객체는 setter() 또는 생성자를 이용해 주입시킨다.  

## IoC/DI 예제  
> 방법1: xml에 bean생성  
- TV01.java & TV02.java  
=> 두개의 서로다른 TV 클래스이다.  
```java
public class TV01 implements TV{

	public TV01() {
		return;
	}
	@Override
	public void turnOn() {
		System.out.println("1: 전원을 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("1: 전원을 끕니다");		
	}

	@Override
	public void volumeUp() {
		System.out.println("1: 볼륨을 높입니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("1: 볼륨을 낮춥니다");
		
	}

}
```
```java
public class TV02 implements TV{
	
	public TV02() {
		return;
	}
	
	@Override
	public void turnOn() {
		System.out.println("2: 전원을 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("2: 전원을 끕니다");		
	}

	@Override
	public void volumeUp() {
		System.out.println("2: 볼륨을 높입니다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("2: 볼륨을 낮춥니다");
		
	}
}
```
- TV.java  
```java
public interface TV {
	public void turnOn();
	public void turnOff();
	public void volumeUp();
	public void volumeDown();

}
```
- TVUser.java
```java
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import IOCExam.tv.TV;

public class TVUser {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		TV tv = factory.getBean("one", TV.class);
		
		tv.turnOn();
		tv.turnOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}
}
```
=> DI는 외부에서 객체를 생성하고 주입시켜주는 방식이므로 xml bean에서 만들어준 것을 주입시켜줘야 한다.  
`ApplicationContext`는 스프링의 핵심적인 클래스이다. Bean을 만들고, 엮어주며 제공해주는 역할을 한다.  

- applicationContext.xml  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
	<bean id="one" class="IOCExam.tv.imp1_TV"/>
	<bean id="two" class="IOCExam.tv.imp2_TV"/>
</beans>
```
=> 이렇게 xml파일의 `bean`안에 객체를 미리 생성해놓는것이다. 이때 주의할점!! xml파일은 반드시 src/main/resources 디렉토리에 만들어준다.  
xml파일에서 `beans`는 xml 태그들을 포함하고 있다. xmlns는 xml에서 네임스페이스를 선언하는 곳이다. bean안에 각각의 클래스에 매핑시키기 위해 id를 임의로 설정해주면 된다.  

만약에 DI방식을 사용하지 않고 new 키워드를 통해 직접 객체를 생성했다면 TV01과 TV02에서 수정사항이 생길경우 각각의 클래스에 가서 모든 값을 변경해주어야 하는데,  
이렇게 외부(applicationContext.xml)에서 객체를 생성 후 사용할 객체에 주입시켜 사용하면 xml에 가서 설정들만 바꿔주면 된다.  

> 방법2: java파일안에 bean생성  
수정중....  
