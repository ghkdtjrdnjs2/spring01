package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// Tag Library : 별로 중요하지 않다.
//				 jsp에서 자바함수를 태그 비슷하게 사용할 수 있게 하는 기술
//				 <c:if>, <c:forEach>

// 다만 Java Standard Tag Library(JSTL)만 사용하고 있다

// 스프링부트는 JSTL을 지원하지 않는다 -> pom.xml에 설정 필요
// 		스프링부트2, 스프링부트3이 다르다

@Controller
public class SampleController5 {
	@GetMapping("/sample4/jstl1")
	public ModelAndView jstl1() {
		ModelAndView mav = new ModelAndView("sample4/jstl1");
		return mav.addObject("username", "spring");
	}
}
