package IOCExam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //나는 설정파일이에요 라는 의미
@ComponentScan("kr.co.multi")
public class MyBeanConfig {
	/*
	 * @Bean public MyBean myBean(MyDAO myDao) { return new MyBean(myDao); }
	 * 
	 * @Bean public MyDAO myDao() { return new MyDAO(); }
	 */
}


