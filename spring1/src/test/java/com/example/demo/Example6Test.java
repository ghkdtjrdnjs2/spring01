package com.example.demo;

import com.example.demo.sample7.Car;
import com.example.demo.sample7.HankukTire;
import com.example.demo.sample7.NexenTire;
import com.example.demo.sample7.Tire;

public class Example6Test {
	public void test1() {
		// 부모 인터페이스로 사용하면 쉽고 편리한 코드가 나온다
		Tire tire = new HankukTire();
		Car car = new Car(tire);
		
		Tire tire2 = new NexenTire();
		car.타이어교환(tire2);
		
		// 부모를 사용한다지만 결국 개발자는 구상 클래스는 사용하고 있잖아?
	}
}
