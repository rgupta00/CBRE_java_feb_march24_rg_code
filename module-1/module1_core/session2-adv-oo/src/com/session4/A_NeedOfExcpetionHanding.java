package com.session4;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExcpetionHanding {
    public static void main(String[] args) {
        //What is exceptions handling: robust
        //try catch throw throws finally
        //compile time ex           vs      run time
        //Checked ex                        uncheked ex(logical problems)

        //Collection thraed, ex handing

//        Scanner scanner=null;
//        try{
//            int a, b;
//             scanner=new Scanner(System.in);
//            System.out.println("PE first no");
//            a=scanner.nextInt();
//
//            System.out.println("PE sec no");
//            b=scanner.nextInt();
//
//            int c=a/b;
//            System.out.println(c);
//
//        }
//        catch (ArithmeticException e){
//            System.out.println("divide by zero");
//        }catch (InputMismatchException e){
//            System.out.println("pls enter int only");
//        }catch (Exception e){
//            System.out.println("some thing else");
//        }finally {
//            scanner.close();
//        }

       //AutoClosable in java 7
        //Automatic resouce mgt
        //pipe oper |
        try(Scanner scanner=new Scanner(System.in)){
            int a, b;
            System.out.println("PE first no");
            a=scanner.nextInt();

            System.out.println("PE sec no");
            b=scanner.nextInt();

            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException |InputMismatchException  e){
            System.out.println("divide by zero");
        }catch (Exception e){
            System.out.println("some thing else");
        }


    }
}


















