package com.cokepluscarbon.thymeleaf;

import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeLeafController {

	private static final Logger logger = LoggerFactory.getLogger(ThymeLeafController.class);

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		model.addAttribute("title", "这是ThymeLeaf标题");
		model.addAttribute("date", new Date());
		model.addAttribute("url", "user");

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(Model model) {
		model.addAttribute("title", "这是ThymeLeaf标题");
		model.addAttribute("date", new Date());
		model.addAttribute("url", "user");

		return "home";
	}

}
