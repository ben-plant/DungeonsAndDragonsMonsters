package com.cyanon.dandd.attacktype.element;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Element implements Serializable {

	private static final long serialVersionUID = 4707936143357022338L;

	private String[] elementalTypes = {"EARTH", "WIND", "FIRE", "WATER", "FAULTY_APP"};
	
	public String elementName;
	protected int elementNameID;
	
	public Element(int i)
	{
		if ((!(i > elementalTypes.length)) || (i >= 4)) //Ensures the element type is not faulty_app, which is
		{												//used to test the switch/case statement below
			this.elementName = elementalTypes[i];
		}
		else
		{
			System.err.println("Erroneous element " + i + " detected! Crashing...");
			System.exit(-1);
		}
	}
	
	public Element getWeaknessAgainst(Element input)
	{
		switch (input.elementNameID)
		{
		case(0):
			return new Element(2); //Fire beats earth
		case(1):
			return new Element(0); //Earth beats water
		case(2):
			return new Element(3); //Water beats fire, obviously
		case(3):
			return new Element(1); //Earth beats water
		default:
			System.err.println("Weakness test failed with element value " + input.elementNameID + ". Crashing...");
			return new Element(4);
		}
	}
	
	public boolean isThisWeakAgainst(Element e1, Element e2)
	{
		if (this.getWeaknessAgainst(e1) == e2)
			return true;
		return false;
	}
}
