package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Yao {

	Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 25);
	Item WanShi = Item.NEW().setAttr(AttrType.Inte, 98, AttrType.Stre, 22, AttrType.Thre, 5);
	Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 21, AttrType.IntePrec, 18);
	Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 26, AttrType.Fina, 17);

}
