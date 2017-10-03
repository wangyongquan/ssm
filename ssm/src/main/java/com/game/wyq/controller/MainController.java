package com.game.wyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.game.wyq.entity.UserEntity;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex() {
		
		UserEntity user = new UserEntity();
		user.setName("wyq");
		user.setPassword("wyq");
		return "index";

	}
}
