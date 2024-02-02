package a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment3Q1 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		// byte
//		try {
//			FileInputStream fr = new 
//					 FileInputStream("/home/raj/Desktop/photo/bar.mp4");
//			FileOutputStream fw = 
//					new FileOutputStream("/home/raj/Desktop/photo/bar2.mp4");
//			
////			BufferedInputStream fr = new 
////					BufferedInputStream(new FileInputStream("/home/raj/Desktop/photo/bar.mp4"));
////			BufferedOutputStream fw = new BufferedOutputStream(
////					new FileOutputStream("/home/raj/Desktop/photo/bar2.mp4"));
//			int i = 0;
//			while ((i = fr.read()) != -1) {
//				fw.write(i);
//			}
//			fw.close();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		long end = System.currentTimeMillis();
//
//		System.out.println("time taken : " + (end - start) + " ms");
		
//		//char
		try {
			FileReader fr=new FileReader("/home/raj/Desktop/photo/bar.mp4");
			FileWriter fw=new FileWriter("/home/raj/Desktop/photo/bar2.mp4");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		
		System.out.println("file is written");
	}
}
