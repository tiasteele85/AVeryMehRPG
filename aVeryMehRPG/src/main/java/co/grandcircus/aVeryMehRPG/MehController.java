package co.grandcircus.aVeryMehRPG;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.aVeryMehRPG.model.ClassTypes;

@Controller
public class MehController {

	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		/*System.out.println(apiService.showAll());
		System.out.println(apiService.showAllWeapons());
		System.out.println(apiService.showCharacter(9));
		System.out.println(apiService.chooseWeapon(apiService.showCharacter(9)));*/
		
		List <ClassTypes> character = apiService.showAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", character);
		return mv;
	}
	
	@RequestMapping("/story")
	public ModelAndView showStory() {
	return new ModelAndView("story");
}

}
