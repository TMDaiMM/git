package soho.hjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/show")
	public String showInfo(Model model) {
		model.addAttribute("msg", "Thymeleaf 第一个案例");
		return "index";
	}
}
