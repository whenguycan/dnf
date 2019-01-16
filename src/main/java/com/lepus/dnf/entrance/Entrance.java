package com.lepus.dnf.entrance;

import com.lepus.dnf.calc.Calculator;
import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;
import com.lepus.dnf.comm.ItemHolder;
import com.lepus.dnf.comm.Nodes;
import com.lepus.dnf.part.*;
import com.lepus.dnf.suit.Suit;
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Entrance {

	public static void main(String[] args) {
		Calculator.SHOW_ITEM_DETAIL = false;
		calc();
	}

	static void calc() {
		Item XiaZi = Item.NEW().setAttr(AttrType.Inte, 1057, AttrType.Stre, 49, AttrType.Inde, 990 + 471, AttrType.CritLeval, 85);
		List<Item> WuQiChengHao = new ArrayList<>();
		WuQiChengHao.add(WuQi.YaoDao);
		WuQiChengHao.add(ChengHao.LongZhiTiaoZhan);

		List<Item> sanCao = new ArrayList<>();
		sanCao.add(SanCao.Zuo.HuangJinBei);
		sanCao.add(SanCao.You.HeiBai);
		sanCao.add(SanCao.ErHuan.YuanDing);

		List<Item> HaiBoLunAn = new ArrayList<>();
		HaiBoLunAn.add(SanCao.Zuo.HaiBoLun);
		HaiBoLunAn.add(SanCao.You.HaiBoLun);
		HaiBoLunAn.add(SanCao.ErHuan.HaiBoLun);
		HaiBoLunAn.add(Suit.HaiBoLunAn);

		List<Item> HaiBoLunGuang = new ArrayList<>();
		HaiBoLunAn.add(SanCao.Zuo.HaiBoLun);
		HaiBoLunAn.add(SanCao.You.HaiBoLun);
		HaiBoLunAn.add(SanCao.ErHuan.HaiBoLun);
		HaiBoLunAn.add(Suit.HaiBoLunGuang);

		List<Item> shouShi = new ArrayList<>();
		shouShi.add(ShouShi.ShouZhuo.WuJin);
		shouShi.add(ShouShi.XiangLian.YinYun);
		shouShi.add(ShouShi.JieZhi.WuJin);

		List<Item> MoZhan = new ArrayList<>();
		MoZhan.add(ZhuangBei.Jian.MoZhan);
		MoZhan.add(ZhuangBei.Xiong.MoZhan);
		MoZhan.add(ZhuangBei.Tui.MoZhan);
		MoZhan.add(ZhuangBei.Yao.MoZhan);
		MoZhan.add(ZhuangBei.Xie.MoZhan);
		MoZhan.add(Suit.MoZhan);

		List<Item> WanShi = new ArrayList<>();
		WanShi.add(ZhuangBei.Jian.WanShi);
		WanShi.add(ZhuangBei.Xiong.WanShi);
		WanShi.add(ZhuangBei.Tui.WanShi);
		WanShi.add(ZhuangBei.Yao.WanShi);
		WanShi.add(ZhuangBei.Xie.WanShi);
		WanShi.add(Suit.WanShi5);

		List<Item> ChaoDaLu = new ArrayList<>();
		ChaoDaLu.add(ZhuangBei.Jian.ChaoDaLu);
		ChaoDaLu.add(ZhuangBei.Xiong.ChaoDaLu);
		ChaoDaLu.add(ZhuangBei.Tui.ChaoDaLu);
		ChaoDaLu.add(ZhuangBei.Yao.ChaoDaLu);
		ChaoDaLu.add(ZhuangBei.Xie.ChaoDaLu);
		ChaoDaLu.add(Suit.ChaoDaLu);

		List<Item> QiZongZui = new ArrayList<>();
		QiZongZui.add(ZhuangBei.Jian.QiZongZui);
		QiZongZui.add(ZhuangBei.Xiong.QiZongZui);
		QiZongZui.add(ZhuangBei.Tui.QiZongZui);
		QiZongZui.add(ZhuangBei.Yao.QiZongZui);
		QiZongZui.add(ZhuangBei.Xie.QiZongZui);
		QiZongZui.add(Suit.QiZongZui);

		List<Item> Meng = new ArrayList<>();
		Meng.add(ShouShi.XiangLian.Meng);
		Meng.add(ShouShi.JieZhi.Meng);
		Meng.add(ShouShi.ShouZhuo.Meng);
		Meng.add(Suit.Meng);

		List<Item> XianZhe = new ArrayList<>();
		XianZhe.add(ShouShi.XiangLian.XianZhe);
		XianZhe.add(ShouShi.JieZhi.XianZhe);
		XianZhe.add(ShouShi.ShouZhuo.XianZhe);
		XianZhe.add(Suit.XianZhe);

		Nodes.NEW()
				.addNode("MoZhan_HaiAn", ItemHolder.NEW().add(XiaZi).add(WuQiChengHao).add(MoZhan).add(HaiBoLunAn).add(shouShi))
				.addNode("QiZongZui_HaiAn", ItemHolder.NEW().add(XiaZi).add(WuQiChengHao).add(QiZongZui).add(HaiBoLunAn).add(shouShi))
				.sort()
				.print();



	}

}
