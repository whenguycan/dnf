package com.lepus.dnf.comm;

import com.lepus.dnf.calc.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Nodes {

	public static Nodes NEW(){
		return new Nodes();
	}

	static class Node{
		String name;
		double damage;
		ItemHolder holder;
		Node(String name, ItemHolder holder){
			this.name = name;
			this.holder = holder;
			this.damage = Calculator.calc(holder.getArray());
		}
	}

	List<Node> list = new ArrayList<>();

	boolean printItemDetail = false;

	public Nodes printItemDetail(boolean print){
		this.printItemDetail = print;
		return this;
	}

	public Nodes addNode(String name, ItemHolder holder){
		list.add(new Node(name, holder));
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
				if(printItemDetail)
					Item.sum(node.holder.items).show();
				System.out.println(node.name + ": " + node.damage);
			}
	}

}
