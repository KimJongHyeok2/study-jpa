package com.web.jpa.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.jpa.domain.UserVO;
import com.web.jpa.repository.UserRepository;

@RestController
public class ApiController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/user/list")
	public List<UserVO> list() {
		return repository.findAll();
	}
	
	@GetMapping("/user/save")
	public UserVO save() {
		UserVO user = UserVO.builder().name("NAME").nickname("테스트").phone("010-7777-7777").build();
		return repository.save(user);
	}
	
	@GetMapping("/user/delete")
	public List<UserVO> delete() {
		repository.deleteAll();
		return repository.findAll();
	}
	
}