package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping
 * 클래스 + 핸들러(메소드)
 * 
 * @author Sewonzzang
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value ="/join", method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/join.jsp";
	}
	

	@RequestMapping(value ="/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo.toString());
		return "redirect:/";
	}
}
