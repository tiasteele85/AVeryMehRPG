package co.grandcircus.aVeryMehRPG;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MehController {

	@RequestMapping("/")
	public ModelAndView showHome() {
		
		return new ModelAndView("home");
	}
}
