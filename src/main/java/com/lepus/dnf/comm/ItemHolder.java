package com.lepus.dnf.comm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemHolder {

	List<Item> items = new ArrayList<>();

	private ItemHolder() {

	}

	public static ItemHolder NEW() {
		return new ItemHolder();
	}

	public ItemHolder add(List<Item> items) {
		this.items.addAll(items);
		return this;
	}

	public ItemHolder add(Item... item) {
		if (item != null)
			this.items.addAll(Arrays.asList(item));
		return this;
	}

	public Item[] getArray() {
		return this.items.toArray(new Item[0]);
	}

}
