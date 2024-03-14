package com.example.demo.sample9;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 빈을 생성하는 방법 1 : 내가 작성한 코드
// @Component <- @Controller, @Service, @Repository

// 스프링 빈을 생성하는 방법 2 : 남의 코드를 스프링빈으로
// @Bean

// 남의 코드의 예로 Logger를 사용해보자
// : 코드 실행 정보를 출력하는 프로그램
// : println()을 사용하면 안된다

// 스프링 설정을 생성하는 어노테이션
@Configuration
public class Example9Config {
	@Bean
	public Logger logger() {
		return LoggerFactory.getLogger(this.getClass());
	}
}
