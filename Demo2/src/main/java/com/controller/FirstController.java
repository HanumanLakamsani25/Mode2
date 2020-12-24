package com.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="user")
public class FirstController {

	@GetMapping(value="/i18n")
	public String login(Model model,Locale locale)
	{
		return "loginsuccess";
	}
}
