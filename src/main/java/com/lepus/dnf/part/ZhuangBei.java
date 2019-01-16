package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface ZhuangBei {

	interface Xiong {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 43, AttrType.Yell, 10);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Stre, 22, AttrType.YellAdd, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 35);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.IntePrec, 15);

	}

	interface Tui {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 43);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Stre, 22, AttrType.CritAdd, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 35, AttrType.YellAdd, 16);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.Thre, 17);

	}

	interface Jian {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 34);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 106, AttrType.Stre, 22, AttrType.Fina, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 29, AttrType.CritAdd, 18);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 35, AttrType.Whit, 15);

	}

	interface Yao {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 25);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 98, AttrType.Stre, 22, AttrType.Thre, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 21, AttrType.IntePrec, 18);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 26, AttrType.Fina, 17);

	}

	interface Xie {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 113, AttrType.Thre, 8);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 98, AttrType.Stre, 22, AttrType.IntePrec, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 21, AttrType.Thre, 18);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 26, AttrType.YellAdd, 15);

	}

}
