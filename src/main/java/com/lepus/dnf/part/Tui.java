package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Tui {

	Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 43);
	Item WanShi = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Stre, 22, AttrType.CritAdd, 5);
	Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 35, AttrType.YellAdd, 16);
	Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.Thre, 17);

}
