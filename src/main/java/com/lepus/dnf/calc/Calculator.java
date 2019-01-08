package com.lepus.dnf.calc;

import com.lepus.dnf.comm.ArrayUtils;
import com.lepus.dnf.comm.Item;

public class Calculator {

	public static final int DEFAULT_DAMAGE = 1;

	public static double calc(Item... items) {
		if (items == null || items.length == 0)
			return 1;
		Item x = new Item();
		double y = DEFAULT_DAMAGE;
		for (Item item : items) {
			for (int i = 0, len = Item.DEFAULT_ATTRS_LEN; i < len; i++) {
				int attr = item.getAttr(i);
				if (attr > 0) {
					if (ArrayUtils.search(new int[]{0, 1, 3, 5, 6, 7, 8, 9, 10, 11}, i) != -1) {
						x.addAttr(i, attr);
					} else if (i == 2 || i == 4) {
						if (attr > x.getAttr(i))
							x.setAttr(i, attr);
					} else if (i == 12) {
						int old = x.getAttr(i);
						if (old == 0) {
							x.setAttr(i, attr);
						} else {
							x.setAttr(i, (100 + old) * (100 + attr)  / 100 - 100);
						}
					}
				}
			}
		}
		y *= 1 + x.getAttrDouble(0) * (1 + x.getAttrDouble(1) / 100) / 250;
		y *= 1 + (x.getAttrDouble(2) + x.getAttrDouble(5)) / 100;
		y *= 1 + (x.getAttrDouble(3) + x.getAttrDouble(6) * (1 + x.getAttrDouble(8) / 220)) / 100;
		y *= 1 + (x.getAttrDouble(4) + x.getAttrDouble(7)) / 100;
		y *= 1 + (x.getAttrDouble(8) / 220);
		y *= x.getAttrDouble(9) * (1 + x.getAttrDouble(10) / 100) / 1000;
		y *= 1 + x.getAttrDouble(11) / 100;
		y *= 1 + x.getAttrDouble(12) / 100;
		return y;
	}

}
