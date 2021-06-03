package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping 클래스 + 핸들러(메소드)
 * 
 * @author Sewonzzang
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/join.jsp";
	}
	/*
	 * @ModelAttribute  받은 데이터가 그대로 jsp로 전달됨
	 * 주로 로그인에서 사용됨
	 */
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute UserVo vo) {
		System.out.println(vo.toString());
		return "redirect:/";
	}
	
//	@RequestMapping(value = "/join", method = RequestMethod.POST)
//	public String join(UserVo vo, Model model) {
//		model.addAttribute("userVo",vo);
//		return "redirect:/";
//	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(/*HttpServletRequest request,*/@RequestParam("n") String name) {
		/**
		 * 만일 n이라는 이름의 파라미터가 없는 경우 
		 * 400 bad request 발생 
		 */
		System.out.println(name);
		return "UserController.update";
	}

	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required=false, defaultValue = "") String name,
			@RequestParam(value="a", required=false, defaultValue = "0") int age
			) {
		System.out.println(name);
		System.out.println(age);
//		if(name==null) {
//			name="";
//		}
//		System.out.println(name);
		
		return "UserController.update";
	}
}
