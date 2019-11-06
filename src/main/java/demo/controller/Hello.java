package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class Hello {
	
	@RequestMapping("/world")
	public static String Hello() {
		return "hello world";
	}
}
