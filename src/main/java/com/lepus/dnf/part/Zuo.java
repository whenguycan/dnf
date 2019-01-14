package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Zuo {

	Item HuangJinBei = Item.NEW().setAttr(AttrType.Inte, 42, AttrType.Stre, 18, AttrType.IntePrec, 18);
	Item HeiBai = Item.NEW().setAttr(AttrType.Inte, 42, AttrType.Thre, 7, AttrType.IntePrec, 7);
	Item HaiBoLun = Item.NEW().setAttr(AttrType.Inte, 124, AttrType.Fina, 20);

}
