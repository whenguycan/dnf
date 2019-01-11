package com.lepus.dnf.calc;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public class Calculator {

	public static final int DEFAULT_DAMAGE = 1;

	public static double calc(Item... items) {
		if (items == null || items.length == 0)
			return 1;
		Item x = Item.init("ALL");
		double y = DEFAULT_DAMAGE;
		for (Item item : items) {
			for (AttrType type : AttrType.values()) {
				int attr = item.getAttr(type);
				if (type == AttrType.Yell || type == AttrType.Crit) {
					if (attr > x.getAttr(type))
						x.setAttr(type, attr);
				} else if (type == AttrType.Skil) {
					int old = x.getAttr(type);
					if (old == 0)
						x.setAttr(type, attr);
					else
						x.setAttr(type, (100 + old) * (100 + attr) / 100 - 100);
				} else {
					x.addAttr(type, attr);
				}
			}
		}
		y *= 1 + x.getAttrDouble(AttrType.Inte) * (1 + x.getAttrDouble(AttrType.IntePrec) / 100) / 250;
		y *= 1 + (x.getAttrDouble(AttrType.Yell) + x.getAttrDouble(AttrType.YellAdd)) / 100;
		y *= 1 + (x.getAttrDouble(AttrType.Whit) + x.getAttrDouble(AttrType.WhitAdd) * (1 + x.getAttrDouble(AttrType.Stre) / 220)) / 100;
		y *= 1 + (x.getAttrDouble(AttrType.Crit) + x.getAttrDouble(AttrType.CritAdd)) / 100;
		y *= 1 + (x.getAttrDouble(AttrType.Stre) / 220);
		y *= x.getAttrDouble(AttrType.Inde) * (1 + x.getAttrDouble(AttrType.Thre) / 100) / 1000;
		y *= 1 + x.getAttrDouble(AttrType.Fina) / 100;
		y *= 1 + x.getAttrDouble(AttrType.Skil) / 100;
		return y;
	}

}
