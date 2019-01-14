package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface You {

	Item ShiBei = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Stre, 18, AttrType.Skil, 18);
	Item HeiBai = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Stre, 55);
	Item HaiBoLun = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Skil, 10);

}
