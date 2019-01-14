package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Xie {

	Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 113, AttrType.Thre, 8);
	Item WanShi = Item.NEW().setAttr(AttrType.Inte, 98, AttrType.Stre, 22, AttrType.IntePrec, 5);
	Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 21, AttrType.Thre, 18);
	Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 26, AttrType.YellAdd, 15);

}
