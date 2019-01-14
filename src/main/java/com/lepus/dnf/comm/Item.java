package com.lepus.dnf.comm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Item {

	private Item(String name) {
		this.name = name;
		for (AttrType type : AttrType.values()) {
			this.attrMap.put(type, 0);
		}
	}

	public static Item NEW() {
		return new Item(null);
	}

	public static Item NEW(String name) {
		return new Item(name);
	}

	private String name;

	private Map<AttrType, Integer> attrMap = new HashMap<>();

	public Item setAttr(AttrType type, int attr) {
		attrMap.put(type, attr);
		return this;
	}

	public Item setAttr(Object... attrs) {
		if (attrs != null && attrs.length != 0 && attrs.length % 2 == 0) {
			try {
				for (int i = 0, len = attrs.length / 2; i < len; i++) {
					Object k = attrs[i * 2];
					AttrType type = (AttrType) k;
					Object v = attrs[i * 2 + 1];
					int attr = (int) v;
					attrMap.put(type, attr);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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

	public void show() {
		for (AttrType type : AttrType.values()) {
			String name = type.name();
			System.out.println(name + ": " + attrMap.get(type));
		}
	}
}
