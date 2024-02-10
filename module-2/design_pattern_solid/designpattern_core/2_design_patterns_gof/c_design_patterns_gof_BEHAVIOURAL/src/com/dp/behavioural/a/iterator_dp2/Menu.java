package com.dp.behavioural.a.iterator_dp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<Item>{

	private List<Item> items=null;
	
	public Menu() {
		items=new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public Iterator<Item> iterator() {
		return new MyIterator();
	}
	
	class MyIterator implements Iterator<Item>{
		int currIndex=0;
		
		@Override
		public boolean hasNext() {
			if(currIndex>=items.size()) {
				return false;
			}
			return true;
		}

		@Override
		public Item next() {
			return items.get(currIndex++);
		}
		
	}
	
}







