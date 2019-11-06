package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.bean.User;

@RestController
@ConfigurationProperties(prefix = "person")
public class Controller2 {
	
	private String name;
	private String addr;
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setName(String name) {
		this.name = name;
	}

	@RequestMapping("/quick2")
	public String getName() {
		return "name:"+name+"--1111--"+"addr:"+addr;
	}
	

}
