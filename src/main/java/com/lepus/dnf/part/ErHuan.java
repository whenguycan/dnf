package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface ErHuan {

	Item YingXiongWang = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Stre, 18, AttrType.Fina, 18);
	Item YuanDing = Item.NEW().setAttr(AttrType.Inte, 63, AttrType.Inde, 189, AttrType.CritAdd, 8);
	Item HeiBai = Item.NEW().setAttr(AttrType.Inte, 184, AttrType.Thre, 15);
	Item HaiBoLun = Item.NEW().setAttr(AttrType.Inte, 118, AttrType.Thre, 22);

}
