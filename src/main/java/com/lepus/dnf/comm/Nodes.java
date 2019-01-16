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
			this.damage = Calculator.calc(holder.items());
		}
	}

	List<Node> list = new ArrayList<>();

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
				System.out.println(node.name + ": " + node.damage);
			}
	}

}
