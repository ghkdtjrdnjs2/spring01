package com.example.demo.sample8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.sample7.Tire;

@Component
public class NewCar {
	// 스프링에게 Tire 주입을 요청
	@Autowired
	private Tire tire;
	
	public void drive() {
		tire.떼굴떼굴();
	}
}
