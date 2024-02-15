package com.dp.behavioural.c.chain_of_resp;

import java.io.*;

public class NeedOfChainOfResp {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader(new File("foo.txt")));
        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch (Exception e){

        }
    }
}
