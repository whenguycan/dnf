package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface ShouShi {

	interface XiangLian {

		Item WuJin = Item.NEW().setAttr(AttrType.Whit, 25);
		Item YinYun = Item.NEW().setAttr(AttrType.Inte, 43, AttrType.Fina, 15);
		Item Meng = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.Stre, 22, AttrType.Fina, 10);
		Item XianZhe = Item.NEW().setAttr(AttrType.Inte, 45, AttrType.Whit, 20);

	}

	interface JieZhi {

		Item WuJin = Item.NEW().setAttr(AttrType.Inte, 62, AttrType.Crit, 30);
		Item QingQuan = Item.NEW().setAttr(AttrType.Inte, 64, AttrType.Thre, 15);
		Item Meng = Item.NEW().setAttr(AttrType.Inte, 67, AttrType.Stre, 22, AttrType.Thre, 10);
		Item XianZhe = Item.NEW().setAttr(AttrType.Inte, 67, AttrType.Fina, 20);

	}

	interface ShouZhuo {

		Item WuJin = Item.NEW().setAttr(AttrType.Yell, 30);
		Item QiMingXing = Item.NEW().setAttr(AttrType.Skil, 15);
		Item Meng = Item.NEW().setAttr(AttrType.Stre, 22, AttrType.YellAdd, 10);
		Item XianZhe = Item.NEW().setAttr(AttrType.YellAdd, 20);

	}

}
