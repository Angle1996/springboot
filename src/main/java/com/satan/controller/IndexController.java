package com.satan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @Description
 * @Author Satan
 * @Date 2020/2/2512:17
 * @Version 1.0
 */
@Controller
public class IndexController {
	@RequestMapping("/test")
	public String test(Model model){
		model.addAttribute("msg", "<h1>天王盖地虎</h1>Dispat");
		model.addAttribute("users", Arrays.asList("狂神","斗罗","唐三","小舞"));
		return "test";
	}
}
