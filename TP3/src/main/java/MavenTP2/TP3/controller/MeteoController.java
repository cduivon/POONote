package MavenTP2.TP3.controller;

import MavenTP2.TP3.model.Coucou;


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
		
		String url = "https://api-adresse.data.gouv.fr/search/?q=" + content + "&limit=1";
		
		Coucou result = (Coucou) template.getForObject(url, Coucou.class);
		
		String urlMeteo = "https://api.meteo-concept.com/api/location/city?token=7589c4782de5e3a8c0c8c46c485a6c1c4b774b918b08aa51c92c3b09b9f84c2a&latitude=" + result.getFeatures()[0].getGeometry().getCoordinates()[0] + "&longitude=" + result.getFeatures()[0].getGeometry().getCoordinates()[1];
		
		MeteoCt meteo = template.getForObject(urlMeteo, MeteoCt.class);
		
		
		
		return "meteo";
	}
	

}
