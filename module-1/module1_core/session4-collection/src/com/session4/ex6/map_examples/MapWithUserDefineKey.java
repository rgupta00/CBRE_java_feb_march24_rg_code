package com.session4.ex6.map_examples;
import java.util.Map.Entry;
class Key implements Comparable<Key>{
	private int k;

	public Key(int k) {
		this.k = k;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [k=").append(k).append("]");
		return builder.toString();
	}

	public int getK() {
		return k;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (k != other.k)
			return false;
		return true;
	}

	@Override
	public int compareTo(Key o) {
		return Integer.compare(this.getK(), o.getK());
	}
	
}
public class MapWithUserDefineKey {
	
	public static void main(String[] args) {
		/*
		 * if ur key is user define object and u want to use TreeMap
		 * then u must impl comparable or comparator otherwise java will get confuse
		 */
		Map<Key, String> map=new TreeMap<>(new Comparator<Key>() {

			@Override
			public int compare(Key o1, Key o2) {
				return Integer.compare(o2.getK(), o1.getK());
			}
		});
		map.put(new Key(124), "one twenty four");
		map.put(new Key(44), "forty four");
		
		
		//String value= map.get(new Key(44));
		//System.out.println(value);
		
		//how to print it
		Set<Entry<Key, String>> entrySet = map.entrySet();
		
		for(Entry<Key, String> entry: entrySet) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}
}
