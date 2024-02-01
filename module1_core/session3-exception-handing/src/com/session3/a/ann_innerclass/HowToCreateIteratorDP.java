package com.session3.a.ann_innerclass;

import java.util.Iterator;

class  MyIterator implements Iterable<String>{

    @Override
    public Iterator<String> iterator() {
        return null;
    }
    class  MyIt implements Iterator<String>{
        @Override
        public boolean hasNext() {
            return false;
        }
        @Override
        public String next() {
            return null;
        }
    }
}
public class HowToCreateIteratorDP {
    public static void main(String[] args) {

    }
}
