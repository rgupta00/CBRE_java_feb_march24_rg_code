package com.session4;

import java.io.*;

public class B_CheckedEx {
    public static void main(String[] args)  {

        //Excpettion wrapping and rethrowing

       try(BufferedReader br=new BufferedReader(new FileReader(new File("foo.txt")))){
           String line=null;
           while ((line=br.readLine())!=null){
               System.out.println(line);
           }
       }catch (FileNotFoundException e){
           System.out.println("file is not found");
       }catch (IOException e){
           System.out.println("file is not found");
       }
       catch (Exception e){
           System.out.println("some other ex");
       }

        System.out.println("end");

    }
}
