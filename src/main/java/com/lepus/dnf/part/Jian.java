package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Jian {

	Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 34);
	Item WanShi = Item.NEW().setAttr(AttrType.Inte, 106, AttrType.Stre, 22, AttrType.Fina, 5);
	Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 29, AttrType.CritAdd, 18);

}
