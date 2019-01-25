package com.lepus.dnf.comm;

import com.lepus.dnf.calc.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nodes {

	public static Nodes NEW(){
		return new Nodes();
	}

	static class Node{
		String name;
		double damage;
		ItemHolder[] holders;
		Node(String name, ItemHolder... holders){
			this.name = name;
			this.holders = holders;
			for(ItemHolder holder : holders)
				this.damage += Calculator.calc(holder.getArray());
			this.damage /= holders.length;
		}
	}

	List<Node> list = new ArrayList<>();

	boolean printItemDetail = false;

	public Nodes printItemDetail(boolean print){
		this.printItemDetail = print;
		return this;
	}

	public Nodes addNode(String name, ItemHolder... holders){
		list.add(new Node(name, holders));
		return this;
	}

	public Nodes sort(){
		list.sort((o1, o2) -> (int) (o2.damage - o1.damage));
		return this;
	}

	public void print(){
		if(list.isEmpty())
			System.out.println("empty");
		else
			for(Node node : list){
				if(printItemDetail) {
					List<Item> all = new ArrayList<>();
					for(ItemHolder holder : node.holders)
						all.addAll(holder.items);
					Item.sum(all).reduce(node.holders.length).show();
				}
				System.out.println(node.name + ": " + node.damage);
			}
	}

}
