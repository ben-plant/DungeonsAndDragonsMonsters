package com.cyanon.dandd.attacktype;

import java.io.Serializable;

import com.cyanon.dandd.attacktype.element.*;

public class Attack implements Serializable {

	private static final long serialVersionUID = 2611534451621765012L;
	
	private String formattedName;
	private final int attackDamage;
	private final int manaRequirement;
	public boolean availableWithCurrentMana;
	private Element attackElement;
	
	public Attack(String string, int i, int j, Element element) {
		this.formattedName = string;
		this.attackDamage = i;
		this.manaRequirement = j;
		this.attackElement = element;
		this.availableWithCurrentMana = false;
	}
	
	public Attack(String string, int i, int j) {
		this.formattedName = string;
		this.attackDamage = i;
		this.manaRequirement = j;
		this.attackElement = new Element(1);
		this.availableWithCurrentMana = false;
	}

	public int getAttackDamage()
	{
		return attackDamage;
	}
	
	public int getManaRequirement()
	{
		return manaRequirement;
	}
	
	public String getAttackName()
	{
		return formattedName;
	}
	
	public Element getAttackElement()
	{
		return attackElement;
	}
	
}
