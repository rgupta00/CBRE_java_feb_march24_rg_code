package com.dp.behavioural.a.iterator_dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu  {

	List<Item> menuItems;

	public Menu() {
		menuItems = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		menuItems.add(item);
	}



}
