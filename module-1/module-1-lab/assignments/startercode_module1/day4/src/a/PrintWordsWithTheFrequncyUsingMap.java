package a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintWordsWithTheFrequncyUsingMap {

	public static void main(String[] args) {
		//1. will create a set
		Map<String, Integer> words=new TreeMap<>();
	
		//2. Write logic to get token of each line and then put token to set
		//(set only allow unique data)
		try(BufferedReader br = new BufferedReader(new FileReader(new File("story.txt")))){ 
			
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					// words is alreay there we need to increse the freq
					if(words.containsKey(token)) {
						Integer freq= words.get(token);
						words.put(token, ++freq);
					}else {
						words.put(token, new Integer(1));
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}

		catch (IOException ex) {
			System.out.println("some io exception");
		} catch (Exception ex) {
			System.out.println("some other problem occured");
		}
		//3. print the set
		 Set<Entry<String, Integer>> entrySet = words.entrySet();
		 for(Entry<String, Integer> entry: entrySet) {
			 System.out.println(entry.getKey() + " : "+ entry.getValue());
		 }
		
	}
}
