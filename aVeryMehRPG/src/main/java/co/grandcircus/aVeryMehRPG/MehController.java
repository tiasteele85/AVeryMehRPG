package co.grandcircus.aVeryMehRPG;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.aVeryMehRPG.dm.DungeonMaster;
import co.grandcircus.aVeryMehRPG.dm.Player;
import co.grandcircus.aVeryMehRPG.model.ClassTypes;

@Controller
public class MehController {

	@Autowired
	ApiService apiService;

	

	@RequestMapping("/")
	public ModelAndView showHome(HttpSession session) {
		session.setAttribute("master", new DungeonMaster());

		// dm = new DungeonMaster();
		System.out.println(apiService.showAll());
		/*
		 * System.out.println(apiService.showAllWeapons());
		 * System.out.println(apiService.showCharacter(9));
		 * System.out.println(apiService.chooseWeapon(apiService.showCharacter(9)));
		 */

		List<ClassTypes> characters = apiService.showAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("list", characters);
		return mv;
	}

	@RequestMapping("/story")
	public ModelAndView showStory(
			@SessionAttribute("master") DungeonMaster dm,
			@RequestParam(value = "Character") int player) {
		Random rand = new Random();
		int num = (rand.nextInt(12));
		dm.player.getHealth().setHealth(5);
		
		
		dm.setEnemy(apiService.showCharacter(num), apiService.chooseWeapon(apiService.showCharacter(num)));
//		int index = Integer.parseInt(player.substring(player.length()-1));
		dm.setPlayer(apiService.showCharacter(player), apiService.chooseWeapon(apiService.showCharacter(player)));
		System.out.println(player);
		
		return new ModelAndView("story","player",dm.player.getName());
	}

	@RequestMapping("/woods")
	public ModelAndView showWoods(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("woods");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/sideOfRoad")
	public ModelAndView showSideOfRoad(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("sideOfRoad");
		mv.addObject(dm.player.getName());
		return mv;

	}

	@RequestMapping("/deathJoke")
	public ModelAndView showDeathJoke(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("deathJoke");
		mv.addObject(dm.player.getName());
		return mv;
	}


	@RequestMapping("/fight")
	public ModelAndView showFightScene(
			@SessionAttribute("master") DungeonMaster dm,
			@RequestParam(value = "punch", required = false) String punch,
			@RequestParam(value = "kick", required = false) String kick,
			@RequestParam(value = "eResponse", required = false) String eResponse) {

		ModelAndView mv = new ModelAndView("fight");
		
		if(punch != null) {
			mv.addObject("punch", punch);
			mv.addObject("eResponse", eResponse);			
		}else {
			mv.addObject("kick", kick);
			mv.addObject("eResponse", eResponse);
		}
		mv.addObject("player", dm.player);
		System.out.println(dm.getPlayer());
		mv.addObject("enemy", dm.enemy);
		System.out.println(dm.getEnemy());
		return mv;
	}

	@RequestMapping("/craftShoes")
	public ModelAndView showShoes(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("craftShoes");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/deeperInTheWoods")
	public ModelAndView showDeeper(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("deeperInTheWoods");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/death")
	public ModelAndView showDeath(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("death");
		mv.addObject(dm.player.getName());
		return mv;
	}
	@RequestMapping("/barFightStory")
	public ModelAndView showFight(
			@SessionAttribute("master") DungeonMaster dm) {
		ModelAndView mv = new ModelAndView("barFightStory");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/takeDamage")
	public ModelAndView takeDamage(
			@SessionAttribute("master") DungeonMaster dm,
			@RequestParam(value = "punch", required = false) String punchbuttonClick,
			@RequestParam(value = "kick", required = false) String kickbuttonClick) {
		System.out.println(punchbuttonClick);
		System.out.println(kickbuttonClick);
		
		Random rand = new Random();
		int toggle = rand.nextInt(2)+1;

		if (punchbuttonClick != null) {
			System.out.println("Here");
			
			dm.takeAPunch();
			dm.BaseFight(toggle);
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				return new ModelAndView("winner");
			} else {
				ModelAndView mv = new ModelAndView("redirect:/fight");
				System.out.println(dm.punchText());
				mv.addObject("punch", dm.punchText());
				if(toggle == 1) {
					mv.addObject("eResponse", dm.punchText());
				}else {
					mv.addObject("eResponse", dm.kickText());
				}
				
				return mv;
			}
		} else if (kickbuttonClick != null) {

			dm.takeAKick();
			dm.BaseFight(toggle);
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				return new ModelAndView("winner");
			} else {
				ModelAndView mv = new ModelAndView("redirect:/fight");
				mv.addObject("punch", dm.kickText());
				if(toggle == 1) {
					mv.addObject("eResponse", dm.punchText());
				}else {
					mv.addObject("eResponse", dm.kickText());
				}
				return mv;
			}
		} else {
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				return new ModelAndView("winner");
			} else {
				return new ModelAndView("redirect:/fight");
			}
		}
	}
}
