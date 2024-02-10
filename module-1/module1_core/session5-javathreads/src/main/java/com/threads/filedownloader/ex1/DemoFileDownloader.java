package com.threads.filedownloader.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//file util: read the files and give list of all files
class FileUtil{
     static List<String> readFile(String fileName){
        List<String> list=new ArrayList<>();
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader(fileName));
            String line=null;
            while ((line=br.readLine())!=null){
                list.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
}
//download files
class DownloadManager{
    public static void download(String url){
        System.out.println(Thread.currentThread().getName()+": "+ "is downloading file"+ url);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+": "+ "is finished file"+ url);
    }
}

public class DemoFileDownloader {
    public static void main(String[] args) {
        List<String> videoUrl=FileUtil.readFile("data.txt");
        for(String url: videoUrl){
            DownloadManager.download(url);
        }
    }
}
