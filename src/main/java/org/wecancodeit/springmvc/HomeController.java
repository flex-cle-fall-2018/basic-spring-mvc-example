package org.wecancodeit.springmvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/greeting")
	public String greetingPage(
		@RequestParam("name") String name,
		Model model
	) {
		model.addAttribute("name", name);
		
		ArrayList<String> tasks = new ArrayList<String>();
		tasks.add("Mow the lawn");
		tasks.add("Feed the dog");
		tasks.add("Buy groceries");
		model.addAttribute("tasks", tasks);
		
		return "greeting";
	}
}
