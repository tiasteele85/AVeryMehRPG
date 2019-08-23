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

import co.grandcircus.aVeryMehRPG.dao.SaveDao;
import co.grandcircus.aVeryMehRPG.dm.DungeonMaster;
import co.grandcircus.aVeryMehRPG.entity.SaveData;
import co.grandcircus.aVeryMehRPG.model.ClassTypes;

@Controller
public class MehController {

	@Autowired
	private ApiService apiService;

	// Create an instance of the database table
	@Autowired
	private SaveDao sDao;

	//Create the homepage
	//Calls the API to collect the list of selectable characters on the homepage
	//
	@RequestMapping("/")
	public ModelAndView showHome() {

		List<ClassTypes> characters = apiService.showAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("list", characters);
		return mv;
	}

	//Creates the story jsp
	//Creates the DM that will travel to all pages
	//Creates the SaveData for the database
	//Adds DM and SaveData to Session
	//Creates a random number to assign a random Enemy
	//Sets Enemy and Player in Class for DM to handle
	//Sets the Enemy and Player in the SaveData
	@RequestMapping("/story")
	public ModelAndView showStory(HttpSession session,
			@RequestParam(value = "Character") int player) {
		DungeonMaster dm = new DungeonMaster();
		SaveData sd = new SaveData();
		session.setAttribute("master", dm);
		session.setAttribute("saver", sd);
		
		Random rand = new Random();
		int num = (rand.nextInt(12));
		dm.player.getHealth().setHealth(5);

		dm.setEnemy(apiService.showCharacter(num), apiService.chooseWeapon(apiService.showCharacter(num)));
//		int index = Integer.parseInt(player.substring(player.length()-1));
		dm.setPlayer(apiService.showCharacter(player), apiService.chooseWeapon(apiService.showCharacter(player)));

		// Set attribute for SaveData to be written to Database
		sd.setName(dm.player.getName());
		sd.setEnemy(dm.enemy.getName());

		// TESTING
		System.out.println("Saver: " + sd.getName());
		System.out.println("Saver id" + sd.getId());
		System.out.println("Player Num: " + player);
		//TESTING

		return new ModelAndView("story", "player", dm.player.getName());
	}

	//Creates Woods JSP
	//Adds user choice to SaveData object for database
	//Adds player name to jsp as an data object
	@RequestMapping("/woods")
	public ModelAndView showWoods(
			@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("drink");
		ModelAndView mv = new ModelAndView("woods");
		mv.addObject(dm.player.getName());
		return mv;
	}

	//Creates SideofRoad 
	//Collects user choices as they proceed through the story
	//
	@RequestMapping("/sideOfRoad")
	public ModelAndView showSideOfRoad(
			@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("leave");	
		ModelAndView mv = new ModelAndView("sideOfRoad");
		mv.addObject(dm.player.getName());
		return mv;

	}

	@RequestMapping("/deathJoke")
	public ModelAndView showDeathJoke(
			@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("i'm a lover not a fighter");
		ModelAndView mv = new ModelAndView("deathJoke");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/fight")
	public ModelAndView showFightScene(
			@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd, 
			@RequestParam(value = "punch", required = false) String punch,
			@RequestParam(value = "kick", required = false) String kick,
			@RequestParam(value = "eResponse", required = false) String eResponse) {

		ModelAndView mv = new ModelAndView("fight");

		if (punch != null) {

			// sd.addAttackSequence("punch");
			mv.addObject("punch", punch);
			mv.addObject("eResponse", eResponse);
		} else if (kick != null) {

			// sd.addAttackSequence("kick");
			mv.addObject("kick", kick);
			mv.addObject("eResponse", eResponse);
		} else {
			mv.addObject("kick", kick);
			mv.addObject("eResponse", eResponse);
		}
		mv.addObject("player", dm.player);
		
		mv.addObject("enemy", dm.enemy);
		
		return mv;
	}

	@RequestMapping("/craftShoes")
	public ModelAndView showShoes(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {

		sd.setDescription("craft shoes");
		ModelAndView mv = new ModelAndView("craftShoes");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/deeperInTheWoods")
	public ModelAndView showDeeper(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("go deeper into the woods");
		dm.player.setWeapon(apiService.reWeapon(4));
		ModelAndView mv = new ModelAndView("deeperInTheWoods");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/death")
	public ModelAndView showDeath(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		ModelAndView mv = new ModelAndView("death");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/barFightStory")
	public ModelAndView showFight(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("walk back in sorrow");
		ModelAndView mv = new ModelAndView("barFightStory");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/sock")
	public ModelAndView showSock(@SessionAttribute("master") DungeonMaster dm, @SessionAttribute("saver") SaveData sd) {
		sd.setDescription("throw my sock");
		sd.setDescription("go sockless wonder go");
		ModelAndView mv = new ModelAndView("sock");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/snarky")
	public ModelAndView showSnarky(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("snarky comment");
		sd.setDescription("smash that spider");
		ModelAndView mv = new ModelAndView("snarky");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/meanie")
	public ModelAndView showMeanie(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("whip your shoes off him");
		ModelAndView mv = new ModelAndView("meanie");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/wrong")
	public ModelAndView showWrong(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("insist he's wrong");
		sd.setDescription("block");
		ModelAndView mv = new ModelAndView("wrong");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/refuse")
	public ModelAndView showRefuse(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("grab the knights dagger and show him how skilled you are with a blade");
		dm.player.setWeapon(apiService.reWeapon(2));
		System.out.println("Reweapon: " + dm.player.getWeapon() );
		sd.setDescription("defend yourself");
		ModelAndView mv = new ModelAndView("refuse");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/takeDamage")
	public ModelAndView takeDamage(@SessionAttribute("master") DungeonMaster dm, @SessionAttribute("saver") SaveData sd,
			@RequestParam(value = "punch", required = false) String punchbuttonClick,
			@RequestParam(value = "kick", required = false) String kickbuttonClick) {
		

		Random rand = new Random();
		int toggle = rand.nextInt(3) + 1;

		if (punchbuttonClick != null) {
			

			dm.takeAPunch();
			sd.addPunch();
			dm.BaseFight(toggle);
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				sd.setHealth(dm.player.getHealth().getHealth());
				sDao.create(sd);
				return new ModelAndView("redirect:/winner");
			} else {
				ModelAndView mv = new ModelAndView("redirect:/fight");
				
				mv.addObject("punch", dm.punchText());
				if (toggle == 1) {
					mv.addObject("eResponse", dm.punchText());
				} else {
					mv.addObject("eResponse", dm.kickText());
				}

				return mv;
			}
		} else if (kickbuttonClick != null) {

			dm.takeAKick();
			sd.addKick();
			dm.BaseFight(toggle);
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				sd.setHealth(dm.player.getHealth().getHealth());
				sDao.create(sd);
				return new ModelAndView("redirect:/winner");
			} else {
				ModelAndView mv = new ModelAndView("redirect:/fight");
				mv.addObject("kick", dm.kickText());
				if (toggle == 1) {
					mv.addObject("eResponse", dm.punchText());
				} else {
					mv.addObject("eResponse", dm.kickText());
				}
				return mv;
			}
		} else {
			
			//dm.weaponDamage();
			dm.BaseFight(toggle);			
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				sd.setHealth(dm.player.getHealth().getHealth());
				sDao.create(sd);
				return new ModelAndView("redirect:/winner");
			} else {
				ModelAndView mv = new ModelAndView("redirect:/fight");
				mv.addObject("weapon", dm.player.getWeapon().getName());
				if (toggle == 1) {
					mv.addObject("eResponse", dm.punchText());
				} else if (toggle == 2){
					mv.addObject("eResponse", dm.kickText());
				}else {
					mv.addObject("eResponse", dm.enemy.getWeapon().getName());
				}
				return mv;
			}
		}
	}

	@RequestMapping("/winner")
	public ModelAndView win() {
		return new ModelAndView("redirect:/winnerBig");
	}

	@RequestMapping("/winnerBig")
	public ModelAndView winPage(@SessionAttribute("master") DungeonMaster dm, @SessionAttribute("saver") SaveData sd,
			HttpSession session) {

		

		ModelAndView mv = new ModelAndView("winner");
		mv.addObject("character", sDao.findbyId(sd.getId()));
		System.out.println("SaveData: " + sd);
		session.invalidate();

		return mv;
	}

	@RequestMapping("/killer")
	public ModelAndView killThemAll(/*
									 * @SessionAttribute("master") DungeonMaster dm,
									 * 
									 * @SessionAttribute("saver") SaveData sd, HttpSession session
									 */) {

//		sDao.delete(sd.getId());

//		session.invalidate();

		return new ModelAndView("redirect:/");
	}
}
