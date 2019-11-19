package com.revature.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.revature.models.SuperHero;
import com.revature.models.SuperPower;

@Repository
public class SuperHeroRepository {

	private Map<String, SuperHero> heroMap = new HashMap<>();
	{
		SuperHero flash = new SuperHero();
		flash.setName("The Flash");
		flash.setPowerLevel(3);
		flash.setSuperPower(SuperPower.SUPER_SPEED);
		flash.setWeakness(SuperPower.SUPER_SPEED);
		heroMap.put("The Flash", flash);
		
		SuperHero hulk = new SuperHero();
		hulk.setName("The Hulk");
		hulk.setPowerLevel(100);
		hulk.setSuperPower(SuperPower.SUPER_STRENGTH);
		hulk.setWeakness(SuperPower.TELEKINESIS);
		heroMap.put("The Hulk", hulk);
		
		SuperHero hackerman = new SuperHero();
		hackerman.setName("Hackerman");
		hackerman.setPowerLevel(4500);
		hackerman.setSuperPower(SuperPower.CHRONO_GENESIS);
		hackerman.setWeakness(SuperPower.GRAVITY);
		heroMap.put("Hackerman", hackerman);
	}
	
	public SuperHero findSuperHeroByName(String name) {
		return heroMap.get(name);
	}

}
