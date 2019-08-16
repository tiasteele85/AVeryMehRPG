package co.grandcircus.aVeryMehRPG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MehController {

	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		System.out.println(apiService.showAll());
		System.out.println(apiService.showAllWeapons());
		System.out.println(apiService.showCharacter(3));
		return new ModelAndView("home");
	}
}
