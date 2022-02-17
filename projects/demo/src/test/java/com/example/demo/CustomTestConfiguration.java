package com.example.demo;

import com.example.bean.Bean1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

@Configuration
@ComponentScan(
        //value = "com.example",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = ASSIGNABLE_TYPE,
                        classes = {
                                Bean1.class,
                        })
        },
        excludeFilters = {
                @ComponentScan.Filter(type = ASSIGNABLE_TYPE,
                        classes = {
                                DemoApplication.class,
                        })
        }
)
public class CustomTestConfiguration {

}
