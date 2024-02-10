package com.dp.behavioural.a.iterator_dp2;

import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Item i1 = new Item("mouse", 7.50f);
		Item i2 = new Item("laptop", 6.00f);
		Item i3 = new Item("DVD", 6.50f);

		
		Menu menu = new Menu();
		menu.addItem(i1);
		menu.addItem(i2);
		menu.addItem(i3);

		System.out.println("Displaying Menu:");
		Iterator<Item> iterator = menu.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
		
		
		
		
		
		
		
//
		
		
		
		
//		System.out.println("\nRemoving last item returned");
//		iterator.remove();
//
//		System.out.println("\nDisplaying Menu:");
//		iterator = menu.iterator();
//		while (iterator.hasNext()) {
//			Item item = iterator.next();
//			System.out.println(item);
//		}

	}

}
