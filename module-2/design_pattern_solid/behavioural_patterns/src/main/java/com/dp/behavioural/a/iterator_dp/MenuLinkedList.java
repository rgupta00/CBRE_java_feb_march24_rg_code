package com.dp.behavioural.a.iterator_dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MenuLinkedList  {

	List<Item> menuItems;

	public MenuLinkedList() {
		menuItems = new LinkedList<Item>();
	}

	public void addItem(Item item) {
		menuItems.add(item);
	}

	public List<Item> getMenuItems() {
		return menuItems;
	}


	

}
