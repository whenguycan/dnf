package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Xiong {

	Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 43, AttrType.Yell, 10);
	Item WanShi = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Stre, 22, AttrType.YellAdd, 5);
	Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 35);
	Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.IntePrec, 15);

}
