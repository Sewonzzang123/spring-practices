package com.douzone.emaillist.repository.test;

import java.util.List;

import com.douzone.emaillist.repository.EmaillistRepository;
import com.douzone.emaillist.vo.EmaillistVo;

public class EmaillistRepositoryTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<EmaillistVo> list = new EmaillistRepository().findAll();
		for(EmaillistVo vo : list) {
			System.out.println(vo.toString());
		}
		
	}

	private static void insertTest() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("또");
		vo.setLastName("치");
		vo.setEmail("ddochi@naver.com");
		new EmaillistRepository().insert(vo);
		
	}
	
	

}
