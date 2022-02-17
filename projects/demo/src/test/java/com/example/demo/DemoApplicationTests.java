package com.example.demo;

import com.example.bean.Bean1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;
import static org.springframework.context.annotation.FilterType.CUSTOM;

@SpringBootTest(classes = CustomTestConfiguration.class)
class DemoApplicationTests {

//	@Configuration
//	@ComponentScan(
//			//value = "com.inspirebrands",
//			includeFilters = {
//					@ComponentScan.Filter(type = ASSIGNABLE_TYPE,
//							classes = {
//									Bean1.class,
//
//							})
//			}
//	)
//	class Config {
//
//	}

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		int i = 1;
		assertNotNull(applicationContext.getBean("bean1"));
	}

}
