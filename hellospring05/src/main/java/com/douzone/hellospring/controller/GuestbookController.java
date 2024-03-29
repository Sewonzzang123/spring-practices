package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RequestMapping
 * 클래스(타입) 단독 매핑
 * 
 * @author Sewonzzang123
 *
 */
@Controller
@RequestMapping("/guestbook") // * : 메소드 이름
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		return "GuestbookController:list";
	}

	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		return "GuestbookController:delete";
	}
}
