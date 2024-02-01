package com.session3.b.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExHandling {
    public static void main(String[] args){
        System.out.println("--------------------");
        //Write a programm to divide 2 no
        //Exception handling: kB: try catch throw throws finally
        //find the risky  code
        //Runtime ex vs compile time ex: bad termonly
        //CheckedEx vs UncheckedEx

//        try{
//            BufferedReader br = new BufferedReader(new FileReader(new File("demo2.txt")));
//            String line=null;
//            while ((line=br.readLine())!=null){
//                System.out.println(line);
//            }
//        }catch (Exception e){
//
//        }


//       try{
//           int i, j , k;
//           Scanner scanner=new Scanner(System.in);
//           System.out.println("PE value of first no");
//           i=scanner.nextInt();
//           j=scanner.nextInt();
//           k=i/j;
//           System.out.println("k : "+ k);
//       }catch (ArithmeticException ex){
//           System.out.println("divide by zero is not possible");
//       }catch (InputMismatchException ex){
//           System.out.println("only ints are possible");
//       }


//        Scanner scanner=null;
//        try{
//            int i, j , k;
//           scanner =new Scanner(System.in);
//            System.out.println("PE value of first no");
//            i=scanner.nextInt();
//            j=scanner.nextInt();
//            k=i/j;
//            System.out.println("k : "+ k);
//        }catch (InputMismatchException | ArithmeticException ex){
//            System.out.println(ex.toString());
//        }
//        catch (Exception ex){
//            System.out.println("divide by zero is not possible");
//        }finally {
//            if(scanner!=null)
//            scanner.close();
//        }
        //java want to releve you from the respo.. of closing the resources?

        //java 7: ARM (Automatic resouce mgt)*

        Scanner scanner=new Scanner(System.in);
        try(scanner){
            int i, j , k;
            System.out.println("PE value of first no");
            i=scanner.nextInt();
            j=scanner.nextInt();
            k=i/j;
            System.out.println("k : "+ k);
        }catch (InputMismatchException | ArithmeticException ex){
            System.out.println(ex.toString());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        //java.lang.IllegalStateException: Scanner closed
        try(scanner){
            int i, j , k;
            System.out.println("PE value of first no");
            i=scanner.nextInt();
            j=scanner.nextInt();
            k=i/j;
            System.out.println("k : "+ k);
        }catch (InputMismatchException | ArithmeticException ex){
           ex.printStackTrace();
        }
        catch (Exception ex){
          ex.printStackTrace();
        }

        //

    }

}
