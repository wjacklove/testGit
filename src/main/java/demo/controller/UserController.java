package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.User;
import demo.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@RequestMapping("/users")
	@ResponseBody
	public List<User> findUser(){
		return userMapper.findUser();
	}
}
