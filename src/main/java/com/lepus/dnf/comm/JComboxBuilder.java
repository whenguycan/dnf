package com.lepus.dnf.comm;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class JComboxBuilder {

	private JComboxBuilder() {

	}

	public static JComboxBuilder NEW() {
		return new JComboxBuilder();
	}

	private Rectangle bounds;

	private Object[] items;

	public JComboxBuilder bounds(int x, int y, int width, int height) {
		this.bounds = new Rectangle(x, y, width, height);
		return this;
	}

	public JComboxBuilder items(Object[] items) {
		this.items = items;
		return this;
	}

	public <T> JComboBox<T> build() {
		JComboBox combox = items != null ? new JComboBox(items) : new JComboBox();
		combox.setBounds(bounds);
		return combox;
	}

}
