package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// slf4j : 사실상의 자바 로깅 표준 -> 표준은 텅비었다 -> 인터페이스
// 스프링이 사용하는 slf4j 구현체는 logback

@SpringBootTest
public class Example9Test {
	@Autowired
	private Logger logger;
	
	// 로깅레벨 : error > warn > info > debug > trace
	//			뒤로 갈수록 세세하게 나온다
	// 설정을 통해서 출력 레벨을 지정할 수 있다
	// 기본 레벨은 info
	@Test
	public void loggerTest() {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}
