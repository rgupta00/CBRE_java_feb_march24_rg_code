package com.session4.ex2.set_examples;

import java.util.*;

class Key implements Comparable<Key>{
    private int k;
    public Key(int k) {
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return k == key.k;
    }
    @Override
    public int hashCode() {
        return Objects.hash(k);
    }

    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }

    @Override
    public int compareTo(Key o) {
        return Integer.compare(this.k, o.k);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Key{");
        sb.append("k=").append(k);
        sb.append('}');
        return sb.toString();
    }
}
public class G_UserDefineKey {
    public static void main(String[] args) {

        Key k1=new Key(44);
        Key k2=new Key(44);

        if(k1.equals(k2)){
            System.out.println("are eq");
        }

        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());

        Set<Key> set=new HashSet<>();
        set.add(new Key(33));
        System.out.println(set.contains(new Key(33)));

//        Set<Key> set=new TreeSet<>(( o1,  o2) -> Integer.compare(o2.getK(), o1.getK()));
//        set.add(new Key(192));
//        set.add(new Key(22));
//
//        for(Key k:set){
//            System.out.println(k.getK());
//        }
    }
}
