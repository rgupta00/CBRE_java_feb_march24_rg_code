package com.basic.io;
import java.io.*;
//find all the unique words from the file
//find freq of each word
/*
    java    apper   5 time
    the     apper   2 time
 */
public class A_HelloIO {
    public static void main(String[] args) {
        //IO: decorator dp
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       try(BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")))){
          String line=null;
          while ((line=br.readLine())!=null){
              String []tokens=line.split(" ");
              for(String token: tokens){
                  System.out.println(token);
              }
          }
       }catch (FileNotFoundException ex){
           ex.printStackTrace();
       }catch (IOException ex){
           ex.printStackTrace();
       }catch (Exception ex){
           ex.printStackTrace();
       }

    }
}