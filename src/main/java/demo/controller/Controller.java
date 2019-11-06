package demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${name}")
	private String name;
	
	@Value("${person.addr}")
	private String addr;
	@RequestMapping("/quick")
	public String getName() {
		return "name:"+name+"----"+"addr:"+addr;
	}
}
