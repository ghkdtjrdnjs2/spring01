package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class SampleController3 {
	@GetMapping("/sample2/test")
	public ModelAndView test() {
		return new ModelAndView("sample2/test");
	}
	
	@PostMapping("/sample2/test")
	public ModelAndView test(HttpServletRequest req) {
		String name = req.getParameter("name");
		Long nai = Long.parseLong(req.getParameter("nai"));
		ModelAndView mav = new ModelAndView("sample2/result2");
		return mav.addObject("name", name).addObject("nai",nai);
	}
}
