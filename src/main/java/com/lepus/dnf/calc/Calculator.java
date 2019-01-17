package com.lepus.dnf.calc;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

import java.util.Collection;

public class Calculator {

	public static final int DEFAULT_DAMAGE = 1;

	public static double calc(Item item, Collection<Item> items){
		if(item == null && (items == null || items.isEmpty()))
			return 1;
		items.add(item);
		return calc(items.toArray(new Item[0]));
	}

	public static double calc(Item... items) {
		if (items == null || items.length == 0)
			return 1;
		Item x = Item.sum(items);
		double y = DEFAULT_DAMAGE;
		y *= 1 + x.getAttrDouble(AttrType.Inte) * (1 + x.getAttrDouble(AttrType.IntePrec) / 100) / 250;
		y *= 1 + (x.getAttrDouble(AttrType.Yell) + x.getAttrDouble(AttrType.YellAdd)) / 100;
		y *= 1 + (x.getAttrDouble(AttrType.Whit) + x.getAttrDouble(AttrType.WhitAdd) * (1 + x.getAttrDouble(AttrType.Stre) / 220)) / 100;
		y *= x.getAttrDouble(AttrType.CritLeval) / 100 * 2 * (1 + (x.getAttrDouble(AttrType.Crit) + x.getAttrDouble(AttrType.CritAdd)) / 100) + (100 - x.getAttrDouble(AttrType.CritLeval)) / 100;
		y *= 1 + (x.getAttrDouble(AttrType.Stre) / 220);
		y *= x.getAttrDouble(AttrType.Inde) * (1 + x.getAttrDouble(AttrType.Thre) / 100) / 1000;
		y *= 1 + x.getAttrDouble(AttrType.Fina) / 100;
		y *= 1 + x.getAttrDouble(AttrType.Skil) / 100;
		return y;
	}

}
