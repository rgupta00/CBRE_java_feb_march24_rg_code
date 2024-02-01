package com.session3.java5_features;
class Shirt{
    private ShirtSize size;
    private String brand;
    public Shirt(ShirtSize size, String brand) {
        this.size = size;
        this.brand = brand;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shirt{");
        sb.append("size=").append(size);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
//interface M{
//    void foo();
//}
////Enum cant extends a class but impl interface
//enum ShirtSize implements M {
//    S(40), L(42), XL(44), XXL(46);
//    private int size;
//    private ShirtSize(int size){
//        this.size = size;
//    }
//    public int getSize() {
//        return size;
//    }
//
//    @Override
//    public void foo() {
//    }
//}



//Enum cant extends a class but impl interface
//enum ShirtSize {
//    S(40), L(42), XL(44), XXL(46);
//    private int size;
//    private ShirtSize(int size){
//        this.size = size;
//    }
//    public int getSize() {
//        return size;
//    }
//
//    public abstract void foo();
//}

enum ShirtSize {
    S(40),
    L(42),
    XL(44),
    XXL(46),
    XXXL(48){
        @Override
        public boolean isOverSized(){
            return true;
        }
    };
    private int size;
    private ShirtSize(int size){
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    public boolean isOverSized(){
        return false;
    }
}

public class UseOfEnum {
    public static void main(String[] args) {
        //enum ==> string

        //String ===> enum
        String sizeString ="S";
        ShirtSize s2=ShirtSize.valueOf(sizeString);
        System.out.println(s2);

        //convert a string to enum and enum to string
        ShirtSize[]shirtSizes=  ShirtSize.values();
        for(ShirtSize s: shirtSizes){
            System.out.println(s.isOverSized());
        }

//        ShirtSize s=ShirtSize.L;
//        System.out.println(s.ordinal()+": "+ s.getSize()+" : "+ s);

//        Shirt s=new Shirt(ShirtSize.L,"PE");
//        System.out.println(s);
    }
}
