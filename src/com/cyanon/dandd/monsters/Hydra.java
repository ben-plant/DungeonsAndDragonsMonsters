package com.cyanon.dandd.monsters;

import java.util.ArrayList;

import com.cyanon.dandd.attacktype.*;
import com.cyanon.dandd.attacktype.element.Element;

public class Hydra extends Monster {

	public Hydra(int health) {
		super(health);
		this.thisMonsterElement = new Element(3); // Hydra is water type
		this.formattedName = "Hydra";

		Hydra.attackArray.add(new Attack("Claw Swipe", 10, 10, new Element(0)));
		Hydra.attackArray.add(new Attack("Headbutt", 15, 20, new Element(0)));
		Hydra.attackArray
				.add(new Attack("Tidal Splash", 20, 30, new Element(3)));
		Hydra.attackArray.add(new Attack("Drive by", 50, 75, new Element(3)));
	}
}
