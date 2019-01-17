package com.lepus.dnf.suit;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface Suit {

	Item MoZhan = Item.NEW().setAttr(AttrType.Whit, 35);
	Item WanShi3 = Item.NEW().setAttr(AttrType.Stre, 25, AttrType.Whit, 15);
	Item WanShi5 = WanShi3.setAttr(AttrType.Crit, 35);
	Item HuangHu = Item.NEW().setAttr(AttrType.Yell, 20, AttrType.Crit, 20);
	Item HaiBoLunGuang = Item.NEW().setAttr(AttrType.Inte, 200, AttrType.WhitAdd, 15);
	Item HaiBoLunAn = Item.NEW().setAttr(AttrType.Inte, 200, AttrType.Skil, 20);
	Item ChaoDaLu = Item.NEW().setAttr(AttrType.Whit, 22, AttrType.Fina, 35);
	Item QiZongZui = Item.NEW().setAttr(AttrType.Skil, 35, AttrType.CritAdd, 25);
	Item Meng = Item.NEW().setAttr(AttrType.YellAdd, 15, AttrType.IntePrec, 10, AttrType.Skil, 10);
	Item XianZhe = Item.NEW().setAttr(AttrType.CritAdd, 35);
	Item XuHuan = Item.NEW().setAttr(AttrType.Whit, 10, AttrType.IntePrec, 20);
	Item ZhengYi = Item.NEW().setAttr(AttrType.Skil, 10, AttrType.CritAdd, 24);
	Item HaLinQing = Item.NEW().setAttr(AttrType.CritAdd, 25, AttrType.Fina, 40);
	Item HaLinBan = Item.NEW().setAttr(AttrType.Thre, 24, AttrType.CritAdd, 40);
	Item CangQiongQing = Item.NEW().setAttr(AttrType.Fina, 20, AttrType.WhitAdd, 30);
	Item CangQiongBan = Item.NEW().setAttr(AttrType.Stre, 20, AttrType.Fina, 20, AttrType.WhitAdd, 30);

}
