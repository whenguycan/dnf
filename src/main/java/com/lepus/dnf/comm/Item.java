package com.lepus.dnf.comm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Item {

	private Item(){

	}

	public static Item init(String name) {
		Item item = new Item();
		item.name = name;
		for (AttrType type : AttrType.values()) {
			item.attrMap.put(type, 0);
		}
		return item;
	}

	private String name;

	private Map<AttrType, Integer> attrMap = new HashMap<>();

	public Item setAttr(AttrType type, int attr) {
		attrMap.put(type, attr);
		return this;
	}

	public Item addAttr(AttrType type, int attr) {
		attrMap.put(type, attrMap.get(type) + attr);
		return this;
	}

	public int getAttr(AttrType type) {
		return attrMap.get(type);
	}

	public double getAttrDouble(AttrType type) {
		int attr = getAttr(type);
		return attr * 1d;
	}

	public String toString() {
		return this.name;
	}
}
