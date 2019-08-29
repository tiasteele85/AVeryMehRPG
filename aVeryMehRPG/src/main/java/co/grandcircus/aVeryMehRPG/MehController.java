package co.grandcircus.aVeryMehRPG;

import java.util.ArrayList;
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
import co.grandcircus.aVeryMehRPG.dm.LeaderBoard;
import co.grandcircus.aVeryMehRPG.entity.SaveData;
import co.grandcircus.aVeryMehRPG.model.ClassTypes;

@Controller
public class MehController {

	@Autowired
	private ApiService apiService;

	// Create an instance of the database table
	@Autowired
	private SaveDao sDao;

	// Create the homepage
	// Calls the API to collect the list of selectable characters on the homepage
	//
	@RequestMapping("/")
	public ModelAndView showHome() {

		List<ClassTypes> characters = apiService.showAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("list", characters);
		return mv;
	}

	// Creates the story jsp
	// Creates the DM that will travel to all pages
	// Creates the SaveData for the database
	// Adds DM and SaveData to Session
	// Creates a random number to assign a random Enemy
	// Sets Enemy and Player in Class for DM to handle
	// Sets the Enemy and Player in the SaveData
	@RequestMapping("/story")
	public ModelAndView showStory(HttpSession session, @RequestParam(value = "Character", required = false) Integer player) {
		DungeonMaster dm = new DungeonMaster();
		SaveData sd = new SaveData();
		session.setAttribute("master", dm);
		session.setAttribute("saver", sd);

		Random rand = new Random();
		int num = (rand.nextInt(12));
		int weaponNum = (rand.nextInt(12) + 1);
		dm.player.getHealth().setHealth(5);
		
		dm.setEnemy(apiService.showCharacter(num), apiService.reWeapon(weaponNum));
		weaponNum = (rand.nextInt(12) + 1);
		System.out.println("Blah Blah" + player);
		if(player == null ) {
			dm.setPlayer(apiService.showCharacter(12), apiService.reWeapon(weaponNum));
		}else {
		dm.setPlayer(apiService.showCharacter(player), apiService.reWeapon(weaponNum));}
		
		// Set attribute for SaveData to be written to Database
		sd.setName(dm.player.getName());
		sd.setEnemy(dm.enemy.getName());

		// TESTING
		System.out.println("Saver: " + sd.getName());
		System.out.println("Saver id" + sd.getId());
		System.out.println("Player Num: " + player);
		// TESTING

		return new ModelAndView("story", "player", dm.player.getName());
	}

	// Creates Woods JSP
	// Adds user choice to SaveData object for database
	// Adds player name to jsp as an data object
	@RequestMapping("/woods")
	public ModelAndView showWoods(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("drink");
		ModelAndView mv = new ModelAndView("woods");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/radiobuttons")
	public ModelAndView showRadio() {
		List<ClassTypes> characters = apiService.showAll();
		ModelAndView mv = new ModelAndView("radiobuttons");
		mv.addObject("list", characters);
		return mv;
	}

	// Creates SideofRoad
	// Collects user choices as they proceed through the story
	//
	@RequestMapping("/sideOfRoad")
	public ModelAndView showSideOfRoad(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("leave");
		ModelAndView mv = new ModelAndView("sideOfRoad");
		mv.addObject(dm.player.getName());
		return mv;

	}

	@RequestMapping("/deathJoke")
	public ModelAndView showDeathJoke(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd) {
		sd.setDescription("i'm a lover not a fighter");
		ModelAndView mv = new ModelAndView("deathJoke");
		mv.addObject(dm.player.getName());
		return mv;
	}

	@RequestMapping("/fight")
	public ModelAndView showFightScene(@SessionAttribute("master") DungeonMaster dm,
			@SessionAttribute("saver") SaveData sd, @RequestParam(value = "punch", required = false) String punch,
			@RequestParam(value = "kick", required = false) String kick,
			@RequestParam(value = "weapon", required = false) String weapon,
			@RequestParam(value = "pDice", required = false) String pDice,
			@RequestParam(value = "eDice", required = false) String eDice,
			@RequestParam(value = "eResponse", required = false) String eResponse) {

		ModelAndView mv = new ModelAndView("fight");

		if (punch != null) {

			// sd.addAttackSequence("punch");
			mv.addObject("punch", punch);
			mv.addObject("eResponse", eResponse);
			mv.addObject("pDice", pDice);
			mv.addObject("eDice", eDice);

		} else if (kick != null) {

			// sd.addAttackSequence("kick");
			mv.addObject("kick", kick);
			mv.addObject("eResponse", eResponse);
			mv.addObject("pDice", pDice);
			mv.addObject("eDice", eDice);
		} else {
			mv.addObject("weapon", weapon);
			mv.addObject("eResponse", eResponse);
			mv.addObject("pDice", pDice);
			mv.addObject("eDice", eDice);
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
		System.out.println("Reweapon: " + dm.player.getWeapon());
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
		int eDamage;
		if (toggle == 1) {
			eDamage = dm.diceRolls("enemy", "basicDamage", false);
		} else if (toggle == 2) {
			eDamage = dm.diceRolls("enemy", "basicDamage", true);
		} else {
			eDamage = dm.diceRolls("enemy", "getDamage", false);
		}

		if (punchbuttonClick != null) {

			int pDamage = dm.diceRolls("player", "basicDamage", false);
			// add to fight page dice
			dm.takeAPunch(pDamage);
			sd.addPunch();

			// add to fight page dice
			dm.BaseFight(toggle, eDamage);

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
				mv.addObject("pDice", pDamage);
				mv.addObject("eDice", eDamage);
				return mv;
			}
		} else if (kickbuttonClick != null) {
			int pDamage = dm.diceRolls("player", "basicDamage", true);
			// add to fight page
			int preHealth = dm.enemy.getHealth().getHealth();
			dm.takeAKick(pDamage);
			//
			sd.addKick();

			dm.BaseFight(toggle, eDamage);
			if (dm.player.getHealth().getHealth() == 0) {
				return new ModelAndView("death");
			} else if (dm.enemy.getHealth().getHealth() == 0) {
				sd.setHealth(dm.player.getHealth().getHealth());
				sDao.create(sd);
				return new ModelAndView("redirect:/winner");
			} else {
				ModelAndView mv = new ModelAndView("redirect:/fight");
				if(preHealth==dm.enemy.getHealth().getHealth()) {
					mv.addObject("kick", "Failed");
				}else {
					mv.addObject("kick", dm.kickText());
				}
				if (toggle == 1) {
					mv.addObject("eResponse", dm.punchText());
				} else {
					if(eDamage == 0) {
						mv.addObject("eResponse", "Failed");
					}else {
						mv.addObject("eResponse", dm.kickText());
					}
				}
				mv.addObject("pDice", pDamage);
				mv.addObject("eDice", eDamage);
				return mv;
			}
		} else {
			int pDamage = dm.diceRolls("player", "getDamage", false);
			// add to fight page
			dm.takeAWeaponDamage(pDamage);
			dm.BaseFight(toggle, eDamage);
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
				} else if (toggle == 2) {
					mv.addObject("eResponse", dm.kickText());
				} else {
					mv.addObject("eResponse", dm.enemy.getWeapon().getName());
				}
				mv.addObject("pDice", pDamage);
				mv.addObject("eDice", eDamage);
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

	@RequestMapping("/leaderBoard")
    public ModelAndView showWinners() {
        ModelAndView mv = new ModelAndView("leaderBoard");
        List<SaveData> allSaves = sDao.findAll();
        List<LeaderBoard> leaders = new ArrayList<>();
        List<LeaderBoard> orderedLeaders = new ArrayList<>();
        boolean added = false;
        leaders.add(new LeaderBoard());
        leaders.get(0).setName(allSaves.get(0).getName());
        leaders.get(0).addPunches(allSaves.get(0).getPunchCount());
        leaders.get(0).addKicks(allSaves.get(0).getKickCount());
        // collect all the leaders into a single value
        for (SaveData saver : allSaves) {
            
            if (saver.getName().equalsIgnoreCase(leaders.get(0).getName())) {
                
                leaders.get(0).addCount();
                leaders.get(0).addPunches(saver.getPunchCount());
                leaders.get(0).addKicks(saver.getKickCount());
            } else {
                for (int i = 0; i < leaders.size(); i++) {
                    if (saver.getName().equalsIgnoreCase(leaders.get(i).getName())) {
                        
                        leaders.get(i).addCount();
                        leaders.get(i).addPunches(saver.getPunchCount());
                        leaders.get(i).addKicks(saver.getKickCount());
                        added = true;
                        
                    }
                }
                if (!added) {
                    leaders.add(new LeaderBoard(saver.getName(), saver.getPunchCount(), saver.getKickCount()));
                }
            }
            added = false;
        }
        
        int max = leaders.get(0).getCount();
        int index = 0;
        int started = leaders.size()-1;
        for(int i = 0; i < started; i++) {
            for(int j = 0; j < leaders.size(); j++) {
                if(max <= leaders.get(j).getCount()) {
                    max = leaders.get(j).getCount();                    
                    index = j;
                }
            }orderedLeaders.add(leaders.get(index));
            leaders.remove(index);
            if(leaders != null) {
                max = leaders.get(0).getCount();
                index = 0;
            }
        }
        if(leaders != null) {
            orderedLeaders.add(leaders.get(0));
        }
        mv.addObject("characters", orderedLeaders);
        return mv;
    }
}