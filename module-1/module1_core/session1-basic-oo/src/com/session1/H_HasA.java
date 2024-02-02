package com.session1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//MG and Musician
class Musician{

    public void playMusic(String inst){
        System.out.println("playing "+ inst);
    }
}
//HAS a- aggigation
class MusicGroup {
    private String musicGroupName;
    private static int counter;
    private List<Musician> musicians=new LinkedList<>();//Array grownble

    public MusicGroup(String musicGroupName){
        this.musicGroupName=musicGroupName;
    }

    public void addMusician(Musician musician){
        ++counter;
        musicians.add(musician);
    }


}
public class H_HasA {
    public static void main(String[] args) {

    }
}
