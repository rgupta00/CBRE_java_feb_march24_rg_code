package com.day5.ex6.map_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class C_FindFreqOfUniqueWords {

	public static void main(String[] args) {
		// m_ali.txt
		// 1. read the file
		// 2.generate tokens
		// 3. use hashmap check if token is alreay then then increae the freq
		// otherwise add new token with freq=1
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("m_ali.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				
				String tokens[] = line.split(" ");
				
				for (String token : tokens) {
					 token= token.toLowerCase();
					 
						Integer freq=map.get(token);
						if(freq==null) {
							map.put(token, 1);
						}else {
							map.put(token, ++freq);
						}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("-------print the map-----------");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
	}
}
