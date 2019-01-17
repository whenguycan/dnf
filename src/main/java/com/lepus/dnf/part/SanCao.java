package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface SanCao {

	interface Zuo {

		Item HuangJinBei = Item.NEW().setAttr(AttrType.Inte, 42, AttrType.Stre, 18, AttrType.IntePrec, 18);
		Item HeiBai = Item.NEW().setAttr(AttrType.Inte, 42, AttrType.Thre, 7, AttrType.IntePrec, 7);
		Item HaiBoLun = Item.NEW().setAttr(AttrType.Inte, 124, AttrType.Fina, 20);
		Item XuHuan = Item.NEW().setAttr(AttrType.Inte, 105, AttrType.Whit, 18);
		Item ZhengYi = Item.NEW().setAttr(AttrType.Inte, 44, AttrType.Fina, 8, AttrType.Skil, 10);

	}

	interface You {

		Item ShiBei = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Stre, 18, AttrType.Skil, 18);
		Item HeiBai = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Stre, 55);
		Item HaiBoLun = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Skil, 10);
		Item XuHuan = Item.NEW().setAttr(AttrType.Inte, 146, AttrType.Stre, 18, AttrType.Skil, 12);
		Item ZhengYi = Item.NEW().setAttr(AttrType.Inte, 66, AttrType.Stre, 45);

	}

	interface ErHuan {

		Item YingXiongWang = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Stre, 18, AttrType.Fina, 18);
		Item YuanDing = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Inde, 189, AttrType.CritAdd, 8);
		Item HeiBai = Item.NEW().setAttr(AttrType.Inte, 184, AttrType.Thre, 15);
		Item HaiBoLun = Item.NEW().setAttr(AttrType.Inte, 118, AttrType.Thre, 22);
		Item XuHuan = Item.NEW().setAttr(AttrType.Inte, 66, AttrType.Inde, 200, AttrType.Fina, 8);
		Item ZhengYi = Item.NEW().setAttr(AttrType.Inte, 66, AttrType.Fina, 10, AttrType.YellAdd, 8);

	}

}
