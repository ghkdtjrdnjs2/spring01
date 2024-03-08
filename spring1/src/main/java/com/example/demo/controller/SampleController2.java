package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SampleController2 {
	// 화면을 보여준다
	@GetMapping("/sample2/add")
	public ModelAndView add() {
		return new ModelAndView("sample2/add");
	}
	// 처리
	@PostMapping("/sample2/add")
	public ModelAndView add(HttpServletRequest req) {
		Long a = Long.parseLong(req.getParameter("val1"));
		Long b = Long.parseLong(req.getParameter("val2"));
		Long result = a+b;
		ModelAndView mav = new ModelAndView("sample2/result");
		return mav.addObject("result", result);
	}
}
