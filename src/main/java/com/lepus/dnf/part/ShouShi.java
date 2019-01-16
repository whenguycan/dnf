package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface ShouShi {

	interface XiangLian {

		Item WuJin = Item.NEW().setAttr(AttrType.Whit, 25);
		Item YinYun = Item.NEW().setAttr(AttrType.Inte, 43, AttrType.Fina, 15);

	}

	interface JieZhi {

		Item WuJin = Item.NEW().setAttr(AttrType.Inte, 62, AttrType.Crit, 30);
		Item QingQuan = Item.NEW().setAttr(AttrType.Inte, 64, AttrType.Thre, 15);

	}

	interface ShouZhuo {

		Item WuJin = Item.NEW().setAttr(AttrType.Yell, 30);
		Item QiMingXing = Item.NEW().setAttr(AttrType.Skil, 15);

	}

}
