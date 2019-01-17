package com.lepus.dnf.part;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;

public interface WuQi {

	Item ShengYao = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Inde, 686, AttrType.Skil, 70);
	Item YaoDao = Item.NEW().setAttr(AttrType.Inte, 112, AttrType.Inde, 686, AttrType.Thre, 22, AttrType.YellAdd, 35);
	Item CangQiong = Item.NEW().setAttr(AttrType.Inte, 117, AttrType.Inde, 723, AttrType.Skil, 45, AttrType.Fina, 30);
	Item JiFengJie = Item.NEW().setAttr(AttrType.Inte, 117, AttrType.Inde, 723, AttrType.Skil, 12, AttrType.Thre, 16, AttrType.IntePrec, 12);

}
