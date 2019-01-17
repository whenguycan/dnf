package com.lepus.dnf.entrance;

import com.lepus.dnf.comm.AttrType;
import com.lepus.dnf.comm.Item;
import com.lepus.dnf.comm.ItemHolder;
import com.lepus.dnf.comm.Nodes;
import com.lepus.dnf.part.*;
import com.lepus.dnf.suit.Suit;

import java.util.ArrayList;
import java.util.List;

public class Entrance {

    public static void main(String[] args) {
        calc();
    }

    static void calc() {
        List<Item> XiaZi = new ArrayList<>();
        XiaZi.add(Item.NEW().setAttr(AttrType.Inte, 1057, AttrType.Stre, 13, AttrType.Inde, 990 + 471, AttrType.CritLeval, 85));
        XiaZi.add(Item.NEW().setAttr(AttrType.Inte, 230, AttrType.Stre, 66, AttrType.Inde, 42));

        List<Item> role = new ArrayList<>();
        role.addAll(XiaZi);
        role.add(WuQi.CangQiong);
        role.add(ChengHao.LongZhiTiaoZhan);

        Nodes.NEW()

                .sort()
                .print();

    }

    static List<Item> getSanCao(){
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.HuangJinBei);
        list.add(SanCao.You.HeiBai);
        list.add(SanCao.ErHuan.YuanDing);
        return list;
    }

    static List<Item> getShouShi(){
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.YinYun);
        list.add(ShouShi.JieZhi.WuJin);
        list.add(ShouShi.ShouZhuo.WuJin);
        return list;
    }

    static List<Item> getXuHuan(){
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.XuHuan);
        list.add(SanCao.You.XuHuan);
        list.add(SanCao.ErHuan.XuHuan);
        list.add(Suit.XuHuan);
        return list;
    }

    static List<Item> getZhengYi(){
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.ZhengYi);
        list.add(SanCao.You.ZhengYi);
        list.add(SanCao.ErHuan.ZhengYi);
        list.add(Suit.ZhengYi);
        return list;
    }

    static List<Item> getXianZhe(){
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.XianZhe);
        list.add(ShouShi.JieZhi.XianZhe);
        list.add(ShouShi.ShouZhuo.XianZhe);
        list.add(Suit.XianZhe);
        return list;
    }

    static List<Item> getMeng(){
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.Meng);
        list.add(ShouShi.JieZhi.Meng);
        list.add(ShouShi.ShouZhuo.Meng);
        list.add(Suit.Meng);
        return list;
    }

    static List<Item> getHaiBoLunGuang(){
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.HaiBoLun);
        list.add(SanCao.You.HaiBoLun);
        list.add(SanCao.ErHuan.HaiBoLun);
        list.add(Suit.HaiBoLunGuang);
        return list;
    }

    static List<Item> getHaiBoLunAn(){
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.HaiBoLun);
        list.add(SanCao.You.HaiBoLun);
        list.add(SanCao.ErHuan.HaiBoLun);
        list.add(Suit.HaiBoLunAn);
        return list;
    }

    static List<Item> getMoZhan(){
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.MoZhan);
        list.add(ZhuangBei.Tui.MoZhan);
        list.add(ZhuangBei.Jian.MoZhan);
        list.add(ZhuangBei.Yao.MoZhan);
        list.add(ZhuangBei.Xie.MoZhan);
        list.add(Suit.MoZhan);
        return list;
    }

    static List<Item> getWanShi(){
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.WanShi);
        list.add(ZhuangBei.Tui.WanShi);
        list.add(ZhuangBei.Jian.WanShi);
        list.add(ZhuangBei.Yao.WanShi);
        list.add(ZhuangBei.Xie.WanShi);
        list.add(Suit.WanShi5);
        return list;
    }

    static List<Item> getChaoDaLu(){
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.ChaoDaLu);
        list.add(ZhuangBei.Tui.ChaoDaLu);
        list.add(ZhuangBei.Jian.ChaoDaLu);
        list.add(ZhuangBei.Yao.ChaoDaLu);
        list.add(ZhuangBei.Xie.ChaoDaLu);
        list.add(Suit.ChaoDaLu);
        list.add(Item.NEW().setAttr(AttrType.Skil, 15));
        return list;
    }

    static List<Item> getQiZongZui(){
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.QiZongZui);
        list.add(ZhuangBei.Tui.QiZongZui);
        list.add(ZhuangBei.Jian.QiZongZui);
        list.add(ZhuangBei.Yao.QiZongZui);
        list.add(ZhuangBei.Xie.QiZongZui);
        list.add(Suit.QiZongZui);
        list.add(Item.NEW().setAttr(AttrType.Inte, 200));
        return list;
    }

}
