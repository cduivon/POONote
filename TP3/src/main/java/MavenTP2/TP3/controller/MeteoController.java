package MavenTP2.TP3.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import MavenTP2.TP3.model.Coucou;


@Controller
public class MeteoController {
	
	RestTemplate template;
	
	public MeteoController(RestTemplate rt) {
		this.template = rt;
	}
	
	@PostMapping("/meteo")
	public String showMeteo(HttpServletRequest request, Model model) {
		
		String content = request.getParameter("address");
		
		content = content.replace(' ', '+');

		model.addAttribute("adresse", content);
		
		String url = "https://api-adresse.data.gouv.fr/search/?q=" + content;
		
		Coucou result = template.getForObject(url, Coucou.class);
		
		model.addAttribute("result", result.getFeatures().length);
		
		
		return "meteo";
	}
	

}
