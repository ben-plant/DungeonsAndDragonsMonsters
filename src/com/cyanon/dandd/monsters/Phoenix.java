package com.cyanon.dandd.monsters;

import java.util.ArrayList;

import com.cyanon.dandd.attacktype.Attack;
import com.cyanon.dandd.attacktype.element.Element;

public class Phoenix extends Monster {

	public Phoenix(int health_in) {
		super(health_in);

		this.thisMonsterElement = new Element(2); // Phoenix is fire type
		this.attackArray = new ArrayList<Attack>();
		this.formattedName = "Phoenix";

		this.attackArray
				.add(new Attack("Flamethrower", 10, 10, new Element(2)));
		this.attackArray.add(new Attack("Napalm", 15, 15, new Element(2)));
		this.attackArray.add(new Attack("Claw Strike", 20, 25, new Element(0)));
		this.attackArray.add(new Attack("Up in yo grill", 50, 30,
				new Element(3)));
	}

}
