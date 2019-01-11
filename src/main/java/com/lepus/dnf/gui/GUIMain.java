package com.lepus.dnf.gui;

import com.lepus.dnf.calc.Calculator;
import com.lepus.dnf.comm.Item;
import com.lepus.dnf.comm.JComboxBuilder;
import com.lepus.dnf.part.Jian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIMain {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setLayout(null);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addComponents(window);

		window.setBounds(100, 100, 800, 600);
		window.setVisible(true);
	}

	private static void addComponents(JFrame window) {
		// zuobian
		JComboBox<Item> comboxJian = JComboxBuilder.NEW().items(new Item[]{Jian.MoZhan}).bounds(0, 0, dim.width, dim.height).build();
		window.add(JComboxBuilder.NEW().items(new String[]{"Tui"}).bounds(0, 25, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"Xie"}).bounds(0, 50, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"Xiong"}).bounds(100, 0, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"Yao"}).bounds(100, 25, dim.width, dim.height).build());

		// youbian
		window.add(JComboxBuilder.NEW().items(new String[]{"WuQi"}).bounds(300, 0, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"ShouZhuo"}).bounds(300, 25, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"Zuo"}).bounds(300, 50, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"ErHuan"}).bounds(300, 75, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"ChengHao"}).bounds(400, 0, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"XiangLian"}).bounds(400, 25, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"JieZhi"}).bounds(400, 50, dim.width, dim.height).build());
		window.add(JComboxBuilder.NEW().items(new String[]{"You"}).bounds(400, 75, dim.width, dim.height).build());

		JLabel labelFinal = new JLabel("2", JLabel.CENTER);
		labelFinal.setBounds(600, 25, dim.width, dim.height);
		window.add(labelFinal);

		JButton button = new JButton("Calc");
		button.setBounds(600, 0, dim.width, dim.height);
		button.addActionListener(e -> {

		});
		window.add(button);
	}

	static Dimension dim = new Dimension(100, 25);

}
