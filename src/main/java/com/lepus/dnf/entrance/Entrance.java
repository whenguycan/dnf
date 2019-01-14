package com.lepus.dnf.entrance;

import com.lepus.dnf.calc.Calculator;
import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;
import com.lepus.dnf.part.*;
import com.lepus.dnf.suit.Suit;

import java.util.ArrayList;
import java.util.List;

public class Entrance {

	public static void main(String[] args) {
		calc();
	}

	private static void calc() {
		Item role = Item.NEW().setAttr(AttrType.Inte, 600, AttrType.Stre, 13, AttrType.Inde, 1000, AttrType.CritLeval, 75);
		List<Item> items = new ArrayList<>();
		items.add(WuQi.YaoDao);
		items.add(ChengHao.LongZhiTiaoZhan);
		items.add(ShouZhuo.WuJin);
		items.add(XiangLian.YinYun);
		items.add(Zuo.HeiBai);
		items.add(JieZhi.WuJin);
		items.add(ErHuan.YuanDing);
		items.add(You.HeiBai);

//		items.add(Jian.MoZhan);
//		items.add(Xiong.MoZhan);
//		items.add(Tui.MoZhan);
//		items.add(Yao.MoZhan);
//		items.add(Xie.MoZhan);
//		items.add(Suit.MoZhan);

		items.add(Jian.WanShi);
		items.add(Xiong.WanShi);
		items.add(Tui.WanShi);
		items.add(Yao.WanShi);
		items.add(Xie.WanShi);
		items.add(Suit.WanShi5);

		double r = Calculator.calc(role, items);
		System.out.println(r);
	}

}
