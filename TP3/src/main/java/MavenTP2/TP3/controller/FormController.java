package MavenTP2.TP3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	
	@GetMapping("/adresse")
	public String showAdresse(Model model) {
		return "adresse";
	}

}
