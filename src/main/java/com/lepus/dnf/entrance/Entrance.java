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
		Calculator.SHOW_ITEM_DETAIL = false;
		calc();
	}

	static void calc() {
		Item role = Item.NEW().setAttr(AttrType.Inte, 1057, AttrType.Stre, 49, AttrType.Inde, 990 + 471, AttrType.CritLeval, 85);
		List<Item> you = new ArrayList<>();
		you.add(WuQi.YaoDao);
		you.add(ChengHao.LongZhiTiaoZhan);
		you.add(ShouZhuo.WuJin);
		you.add(XiangLian.YinYun);
		you.add(Zuo.HuangJinBei);
		you.add(JieZhi.WuJin);
		you.add(ErHuan.YuanDing);
		you.add(You.HeiBai);

		calcMoZhan(role, you);
		calcWanShi(role, you);
		calcChaoDaLu(role, you);

	}

	static void calcMoZhan(Item role, List<Item> you) {
		List<Item> all = new ArrayList<>(you);
		all.add(Jian.MoZhan);
		all.add(Xiong.MoZhan);
		all.add(Tui.MoZhan);
		all.add(Yao.MoZhan);
		all.add(Xie.MoZhan);
		all.add(Suit.MoZhan);
		double r = Calculator.calc(role, all);
		System.out.println(r);
	}

	static void calcWanShi(Item role, List<Item> you) {
		List<Item> all = new ArrayList<>(you);
		all.add(Jian.WanShi);
		all.add(Xiong.WanShi);
		all.add(Tui.WanShi);
		all.add(Yao.WanShi);
		all.add(Xie.WanShi);
		all.add(Suit.WanShi5);
		double r = Calculator.calc(role, all);
		System.out.println(r);
	}

	static void calcChaoDaLu(Item role, List<Item> you) {
		List<Item> all = new ArrayList<>(you);
		all.add(Jian.ChaoDaLu);
		all.add(Xiong.ChaoDaLu);
		all.add(Tui.ChaoDaLu);
		all.add(Yao.ChaoDaLu);
		all.add(Xie.ChaoDaLu);
		all.add(Suit.ChaoDaLu);
		double r = Calculator.calc(role, all);
		System.out.println(r);
	}

}
