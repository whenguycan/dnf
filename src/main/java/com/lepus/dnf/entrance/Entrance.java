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
        XiaZi.add(Item.NEW().setAttr(AttrType.Inte, 1644, AttrType.Stre, 51, AttrType.Inde, 1073 + 471, AttrType.CritLeval, 92));
        XiaZi.add(Item.NEW().setAttr(AttrType.Inde, 40, AttrType.Stre, 15));

        Item DaZao = Item.NEW().setAttr(AttrType.Inte, 25 * 3, AttrType.Stre, 9 * 3);   // 垃圾打造
//        Item DaZao = Item.NEW().setAttr(AttrType.Inte, 40 * 3 + 75 + 30 + 26 * 2, AttrType.Stre, 15 * 3 + 12, AttrType.Inde, 42 + 45);   // 凑和打造

        List<Item> role = new ArrayList<>();
        role.addAll(XiaZi);
        role.add(DaZao);
        role.add(WuQi.CangQiong);
        role.add(ChengHao.LongZhiTiaoZhan);

        Nodes.NEW()
//                .addNode("苍穹板_江山_海博伦", ItemHolder.NEW().add(role).add(getCangQiongBan()).add(getHaiBoLunGuang()).add(getJiangShan()), ItemHolder.NEW().add(role).add(getCangQiongBan()).add(getHaiBoLunAn()).add(getJiangShan()))
//                .addNode("苍穹板_江山_虚幻", ItemHolder.NEW().add(role).add(getCangQiongBan()).add(getXuHuan()).add(getJiangShan()))
//                .addNode("苍穹板_梦_海博伦", ItemHolder.NEW().add(role).add(getCangQiongBan()).add(getHaiBoLunGuang()).add(getMeng()), ItemHolder.NEW().add(role).add(getCangQiongBan()).add(getHaiBoLunAn()).add(getMeng()))
//                .addNode("苍穹板_梦_虚幻", ItemHolder.NEW().add(role).add(getCangQiongBan()).add(getXuHuan()).add(getMeng()))

//                .addNode("哈林板_江山_海博伦", ItemHolder.NEW().add(role).add(getHaLinBan()).add(getHaiBoLunGuang()).add(getJiangShan()), ItemHolder.NEW().add(role).add(getHaLinBan()).add(getHaiBoLunAn()).add(getJiangShan()))
//                .addNode("七宗罪_江山_海博伦", ItemHolder.NEW().add(role).add(getQiZongZui()).add(getHaiBoLunGuang()).add(getJiangShan()), ItemHolder.NEW().add(role).add(getQiZongZui()).add(getHaiBoLunAn()).add(getJiangShan()))
//                .addNode("哈林轻_梦_海博伦", ItemHolder.NEW().add(role).add(getHaLinQing()).add(getHaiBoLunGuang()).add(getMeng()), ItemHolder.NEW().add(role).add(getHaLinQing()).add(getHaiBoLunAn()).add(getMeng()))
                .addNode("哈林板_梦_海博伦", ItemHolder.NEW().add(role).add(getHaLinBan()).add(getHaiBoLunGuang()).add(getMeng()), ItemHolder.NEW().add(role).add(getHaLinBan()).add(getHaiBoLunAn()).add(getMeng()))
                .addNode("哈林皮_梦_海博伦", ItemHolder.NEW().add(role).add(getHaLinPi()).add(getHaiBoLunGuang()).add(getMeng()), ItemHolder.NEW().add(role).add(getHaLinPi()).add(getHaiBoLunAn()).add(getMeng()))
                .addNode("七宗罪_梦_海博伦", ItemHolder.NEW().add(role).add(getQiZongZui()).add(getHaiBoLunGuang()).add(getMeng()), ItemHolder.NEW().add(role).add(getQiZongZui()).add(getHaiBoLunAn()).add(getMeng()))

//                .addNode("哈林板_江山_虚幻", ItemHolder.NEW().add(role).add(getHaLinBan()).add(getXuHuan()).add(getJiangShan()))
//                .addNode("七宗罪_江山_虚幻", ItemHolder.NEW().add(role).add(getQiZongZui()).add(getXuHuan()).add(getJiangShan()))
//                .addNode("哈林轻_梦_虚幻", ItemHolder.NEW().add(role).add(getHaLinQing()).add(getXuHuan()).add(getMeng()))
                .addNode("哈林板_梦_虚幻", ItemHolder.NEW().add(role).add(getHaLinBan()).add(getXuHuan()).add(getMeng()))
                .addNode("哈林皮_梦_虚幻", ItemHolder.NEW().add(role).add(getHaLinPi()).add(getXuHuan()).add(getMeng()))
                .addNode("七宗罪_梦_虚幻", ItemHolder.NEW().add(role).add(getQiZongZui()).add(getXuHuan()).add(getMeng()))

//                .addNode("魔战_现有", ItemHolder.NEW().add(role).add(getMoZhan()).add(getShouShi()).add(getSanCao()))
                .sort()
                .print();

    }

    static List<Item> getCangQiongQing() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.CangQiongQing);
        list.add(ZhuangBei.Tui.CangQiongQing);
        list.add(ZhuangBei.Jian.CangQiongQing);
        list.add(ZhuangBei.Yao.CangQiongQing);
        list.add(ZhuangBei.Xie.CangQiongQing);
        list.add(Suit.CangQiongQing);
        return list;
    }

    static List<Item> getCangQiongBan() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.CangQiongBan);
        list.add(ZhuangBei.Tui.CangQiongBan);
        list.add(ZhuangBei.Jian.CangQiongBan);
        list.add(ZhuangBei.Yao.CangQiongBan);
        list.add(ZhuangBei.Xie.CangQiongBan);
        list.add(Suit.CangQiongBan);
        list.add(Item.NEW().setAttr(AttrType.Inte, 200));
        return list;
    }

    static List<Item> getHaLinQing() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.HaLinQing);
        list.add(ZhuangBei.Tui.HaLinQing);
        list.add(ZhuangBei.Jian.HaLinQing);
        list.add(ZhuangBei.Yao.HaLinQing);
        list.add(ZhuangBei.Xie.HaLinQing);
        list.add(Suit.HaLinQing);
        list.add(Item.NEW().setAttr(AttrType.Inte, 200));
        return list;
    }

    static List<Item> getHaLinBan() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.HaLinBan);
        list.add(ZhuangBei.Tui.HaLinBan);
        list.add(ZhuangBei.Jian.HaLinBan);
        list.add(ZhuangBei.Yao.HaLinBan);
        list.add(ZhuangBei.Xie.HaLinBan);
        list.add(Suit.HaLinBan);
        list.add(Item.NEW().setAttr(AttrType.Inte, 200));
        return list;
    }

    static List<Item> getHaLinPi() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.HaLinPi);
        list.add(ZhuangBei.Tui.HaLinPi);
        list.add(ZhuangBei.Jian.HaLinPi);
        list.add(ZhuangBei.Yao.HaLinPi);
        list.add(ZhuangBei.Xie.HaLinPi);
        list.add(Suit.HaLinPi);
        list.add(Item.NEW().setAttr(AttrType.Inte, 200));
        return list;
    }

    static List<Item> getSanCao() {
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.HuangJinBei);
        list.add(SanCao.You.XuHuan);
        list.add(SanCao.ErHuan.HaiBoLun);
        return list;
    }

    static List<Item> getShouShi() {
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.YinYun);
        list.add(ShouShi.JieZhi.WuJin);
        list.add(ShouShi.ShouZhuo.WuJin);
        return list;
    }

    static List<Item> getXuHuan() {
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.XuHuan);
        list.add(SanCao.You.XuHuan);
        list.add(SanCao.ErHuan.XuHuan);
        list.add(Suit.XuHuan);
        return list;
    }

    static List<Item> getZhengYi() {
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.ZhengYi);
        list.add(SanCao.You.ZhengYi);
        list.add(SanCao.ErHuan.ZhengYi);
        list.add(Suit.ZhengYi);
        return list;
    }

    static List<Item> getXianZhe() {
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.XianZhe);
        list.add(ShouShi.JieZhi.XianZhe);
        list.add(ShouShi.ShouZhuo.XianZhe);
        list.add(Suit.XianZhe);
        return list;
    }

    static List<Item> getMeng() {
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.Meng);
        list.add(ShouShi.JieZhi.Meng);
        list.add(ShouShi.ShouZhuo.Meng);
        list.add(Suit.Meng);
        return list;
    }

    static List<Item> getJiangShan() {
        List<Item> list = new ArrayList<>();
        list.add(ShouShi.XiangLian.JiangShan);
        list.add(ShouShi.JieZhi.JiangShan);
        list.add(ShouShi.ShouZhuo.JiangShan);
        list.add(Suit.JiangShan);
        return list;
    }

    static List<Item> getHaiBoLunGuang() {
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.HaiBoLun);
        list.add(SanCao.You.HaiBoLun);
        list.add(SanCao.ErHuan.HaiBoLun);
        list.add(Suit.HaiBoLunGuang);
        return list;
    }

    static List<Item> getHaiBoLunAn() {
        List<Item> list = new ArrayList<>();
        list.add(SanCao.Zuo.HaiBoLun);
        list.add(SanCao.You.HaiBoLun);
        list.add(SanCao.ErHuan.HaiBoLun);
        list.add(Suit.HaiBoLunAn);
        return list;
    }

    static List<Item> getMoZhan() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.MoZhan);
        list.add(ZhuangBei.Tui.MoZhan);
        list.add(ZhuangBei.Jian.MoZhan);
        list.add(ZhuangBei.Yao.MoZhan);
        list.add(ZhuangBei.Xie.MoZhan);
        list.add(Suit.MoZhan);
        list.add(Item.NEW().setAttr(AttrType.Inte, 200));
        return list;
    }

    static List<Item> getWanShi() {
        List<Item> list = new ArrayList<>();
        list.add(ZhuangBei.Xiong.WanShi);
        list.add(ZhuangBei.Tui.WanShi);
        list.add(ZhuangBei.Jian.WanShi);
        list.add(ZhuangBei.Yao.WanShi);
        list.add(ZhuangBei.Xie.WanShi);
        list.add(Suit.WanShi5);
        return list;
    }

    static List<Item> getChaoDaLu() {
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

    static List<Item> getQiZongZui() {
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
