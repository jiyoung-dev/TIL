package com.todo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@ComponentScan(basePackages= {"com.todo.dao", "com.todo.service"})
@Import({MyBatisConfig.class})
public class ApplicationConfig {
	@Bean
	public DataSource dataSource() { 
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(oracle.jdbc.driver.OracleDriver.class);
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("master");
		dataSource.setPassword("1004");
		return dataSource;
	}
	
	
}
