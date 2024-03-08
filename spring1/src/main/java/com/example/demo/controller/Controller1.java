package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

@Controller
public class Controller1 {
	@GetMapping("/example1")
	public ModelAndView example1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1");
		return mav;
	}
	
	@GetMapping("/example2")
	public ModelAndView example2() {
		ModelAndView mav = new ModelAndView("example2");
		return mav;
	}
	
	@GetMapping("/example3")
	public ModelAndView example3() {
		ModelAndView mav = new ModelAndView("example3");
		mav.addObject("message", "안녕하세요");
		return mav;
	}
	// 사용자가 입력한 값을 jsp로 출력하기
	// 스프링 컨트롤러 메소드의 인자를 적으면 스프링이 넣어준다
	// !!!!!!!!!!! 의존성 주입 (Dependency Injection = DI)!!!!!!!!!!!!!!!!!!
	// 아래 코드가 가장 기본적인 형태의 코드, 누가 짜도 거의 똑같이 나온다
	@GetMapping("/example4") // 주소는 무조건 / 들어가야한다
	public ModelAndView example4(HttpServletRequest request) {
		String irum = request.getParameter("irum");
		ModelAndView mav = new ModelAndView("sample1/example4"); // jsp이름은 / 들어가면 안된다
		mav.addObject("irum", irum );
		return mav;
	}
}