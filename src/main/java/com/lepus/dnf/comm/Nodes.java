package com.lepus.dnf.comm;

import java.util.ArrayList;
import java.util.List;

public class Nodes {

	public static Nodes NEW(){
		return new Nodes();
	}

	static class Node{
		String name;
		double damage;
		Node(String name, double damage){
			this.name = name;
			this.damage = damage;
		}
	}

	List<Node> list = new ArrayList<>();

	public Nodes addNode(String name, double damage){
		list.add(new Node(name, damage));
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
