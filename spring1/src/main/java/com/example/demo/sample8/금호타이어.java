package com.example.demo.sample8;

import org.springframework.stereotype.Component;

import com.example.demo.sample7.Tire;

// 의존성 주입
// 1. 스프링은 프로젝트에서 @Component가 붙은 클래스의 객체를 생성 -> 스프링 bean
// 2. 생성한 객체는 스프링에 등록
// 3. @Autpwired 어노테이션을 만나면 객체를 주입한다

@Component
public class 금호타이어 implements Tire {
	@Override
	public void 떼굴떼굴() {
		System.out.println("금호타이어 떼굴 떼굴");
	}
}
