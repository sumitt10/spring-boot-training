package com.example.springboot.FirstRESTAPI.Helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldResource {
	@RequestMapping("/firstapi")
	@ResponseBody
	public String Helloworld() {
		return "Hello World";
	}
}
