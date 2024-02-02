package c;
import java.util.*;

import b.Book;

import java.io.*;
public class ReadFileAndBiggestNo {

	public static void main(String[] args) {
		//read file and make a list of double nos
		List<Double> doubles=readAndGetList();
		
		//revese sorting: we want biggest no
		Collections.sort(doubles, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(doubles.get(0));
		
	}

	private static List<Double> readAndGetList() {
		List<Double> doubles=new ArrayList<>();
		String line=null;
		
		try (BufferedReader br=new BufferedReader(new FileReader("nos.txt"))){
			while((line=br.readLine())!=null) {
				doubles.add(Double.parseDouble(line));
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return doubles;
	}
}
