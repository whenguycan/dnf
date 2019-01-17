package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface ZhuangBei {

	interface Xiong {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 43, AttrType.Yell, 10);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Stre, 22, AttrType.YellAdd, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 35, AttrType.Skil, 10);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.IntePrec, 15);
		Item HaLinQing = Item.NEW().setAttr(AttrType.Inte, 37, AttrType.IntePrec, 17);
		Item HaLinBan = Item.NEW().setAttr(AttrType.Inte, 46, AttrType.Stre, 22, AttrType.Whit, 10);
		Item CangQiongQing = Item.NEW().setAttr(AttrType.Inte, 37, AttrType.YellAdd, 14);
		Item CangQiongBan = Item.NEW().setAttr(AttrType.Inte, 46, AttrType.CritAdd, 14);

	}

	interface Tui {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 43);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Stre, 22, AttrType.CritAdd, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 35, AttrType.YellAdd, 16);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.Thre, 17);
		Item HaLinQing = Item.NEW().setAttr(AttrType.Inte, 37, AttrType.Thre, 17);
		Item HaLinBan = Item.NEW().setAttr(AttrType.Inte, 46, AttrType.Stre, 22, AttrType.Whit, 10);
		Item CangQiongQing = Item.NEW().setAttr(AttrType.Inte, 37, AttrType.CritAdd, 14);
		Item CangQiongBan = Item.NEW().setAttr(AttrType.Inte, 46, AttrType.Stre, 16, AttrType.Thre, 13);

	}

	interface Jian {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 34);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 106, AttrType.Stre, 22, AttrType.Fina, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 29, AttrType.CritAdd, 18);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 35, AttrType.Whit, 15);
		Item HaLinQing = Item.NEW().setAttr(AttrType.Inte, 30, AttrType.Thre, 16);
		Item HaLinBan = Item.NEW().setAttr(AttrType.Inte, 37, AttrType.Inde, 100, AttrType.IntePrec, 10);
		Item CangQiongQing = Item.NEW().setAttr(AttrType.Inte, 30, AttrType.Skil, 14);
		Item CangQiongBan = Item.NEW().setAttr(AttrType.Inte, 37, AttrType.Skil, 12);

	}

	interface Yao {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 25);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 98, AttrType.Stre, 22, AttrType.Thre, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 21, AttrType.IntePrec, 18);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 26, AttrType.Fina, 17);
		Item HaLinQing = Item.NEW().setAttr(AttrType.Inte, 22, AttrType.Inde, 50, AttrType.IntePrec, 13);
		Item HaLinBan = Item.NEW().setAttr(AttrType.Inte, 28, AttrType.Stre, 18, AttrType.IntePrec, 10);
		Item CangQiongQing = Item.NEW().setAttr(AttrType.Inte, 22, AttrType.Thre, 15);
		Item CangQiongBan = Item.NEW().setAttr(AttrType.Inte, 28, AttrType.Stre, 14, AttrType.IntePrec, 13);

	}

	interface Xie {

		Item MoZhan = Item.NEW().setAttr(AttrType.Inte, 113, AttrType.Thre, 8);
		Item WanShi = Item.NEW().setAttr(AttrType.Inte, 98, AttrType.Stre, 22, AttrType.IntePrec, 5);
		Item ChaoDaLu = Item.NEW().setAttr(AttrType.Inte, 21, AttrType.Thre, 18);
		Item QiZongZui = Item.NEW().setAttr(AttrType.Inte, 26, AttrType.YellAdd, 15);
		Item HaLinQing = Item.NEW().setAttr(AttrType.Inte, 22, AttrType.Inde, 50, AttrType.IntePrec, 13);
		Item HaLinBan = Item.NEW().setAttr(AttrType.Inte, 28, AttrType.Stre, 18, AttrType.IntePrec, 10);
		Item CangQiongQing = Item.NEW().setAttr(AttrType.Inte, 22, AttrType.Stre, 30);
		Item CangQiongBan = Item.NEW().setAttr(AttrType.Inte, 28, AttrType.Whit, 14);

	}

}
