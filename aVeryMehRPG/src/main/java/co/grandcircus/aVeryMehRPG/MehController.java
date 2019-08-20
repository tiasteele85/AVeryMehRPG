package co.grandcircus.aVeryMehRPG;

import java.util.List;
import java.util.Random;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.aVeryMehRPG.dm.DungeonMaster;
import co.grandcircus.aVeryMehRPG.dm.Player;
import co.grandcircus.aVeryMehRPG.model.ClassTypes;

@Controller
public class MehController {

	@Autowired
	ApiService apiService;
	
	DungeonMaster dm;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		dm = new DungeonMaster();
		System.out.println(apiService.showAll());
		/*System.out.println(apiService.showAllWeapons());
		System.out.println(apiService.showCharacter(9));
		System.out.println(apiService.chooseWeapon(apiService.showCharacter(9)));*/
		
		List <ClassTypes> characters = apiService.showAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("list", characters);
		return mv;
	}
	
	@RequestMapping("/story")
	public ModelAndView showStory(
			@RequestParam(value="Character") int player) {
		Random rand = new Random();
		int num = (rand.nextInt(12));
		dm.setEnemy(apiService.showCharacter(num), apiService.chooseWeapon(apiService.showCharacter(num)));
//		int index = Integer.parseInt(player.substring(player.length()-1));
		dm.setPlayer(apiService.showCharacter(player), apiService.chooseWeapon(apiService.showCharacter(player)));
		System.out.println(player);
		
		
		
		
	return new ModelAndView("story", "player", dm.player.getName());
}
	
	@RequestMapping("/fight")
	public ModelAndView showFightScene() {
		
		ModelAndView mv =  new ModelAndView("fight");
		mv.addObject("player" , dm.getPlayer());
		System.out.println(dm.getPlayer());
		mv.addObject("enemy" , dm.getEnemy());
		System.out.println(dm.getEnemy());
		return mv;
	}
	
	@RequestMapping("/takeDamage")
	public ModelAndView takeDamage(
			@RequestParam(value="punch", required=false) String buttonClick) {
		System.out.println(buttonClick);
		
		if(buttonClick.equals("punch"))
		{		
			dm.takeAPunch();
			dm.giveAPunch();
			if(dm.takeAPunch().equals("You're Dead")) {
				return new ModelAndView("death");
			}else if (dm.giveAPunch().equals("They're Dead")) {
				return new ModelAndView("winner");
			}else {
				return new ModelAndView("redirect:/fight");
			}
		}else {
			if(dm.takeAPunch().equals("You're Dead")) {
				return new ModelAndView("death");
			}else if (dm.takeAPunch().equals("You're Dead")) {
				return new ModelAndView("winner");
			}else {
				return new ModelAndView("redirect:/fight");
			}
		}
		
	}

}
