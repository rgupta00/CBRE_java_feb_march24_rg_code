package com.dp.behavioural.e.strategy_dp;
/*
    Maths: sort: bubble merge radix i need flexiably
 */
//class MathsLib{
//    private int arr[];
//    public MathsLib(){
//        arr=new int[100];
//    }
//    //BS
//    public int findMedian(){
//        //sort
//        return 1;
//    }
//    public int findMax(){
//        //sort
//        return 1;
//    }
//}
//class MathsLibMerge extends MathsLib{
//    private int arr[];
//    public MathsLibMerge(){
//        arr=new int[100];
//    }
//    //MS
//    public int findMedian(){
//        //sort
//        return 1;
//    }
//    public int findMax(){
//        //sort
//        return 1;
//    }
//}
/*
It allows an object to choose from multiple algorithms and behaviors at runtime,
 instead of statically choosing a single one
 */
interface Sortable{
    public int [] sort(int []arr);
}
class BubbleSortStrategy implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        //u are writting logic to do bubble sort
        return null;
    }
}
class MergeSortStrategy implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        //u are writting logic to do merge sort
        return null;
    }
}
class RadixSortStrategy implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        //u are writting logic to do radix sort
        return null;
    }
}
class MathsLib{
    private int arr[];
    private Sortable sortable=new BubbleSortStrategy();

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public MathsLib(){
        arr=new int[100];
    }
    //BS
    public int findMedian(){
        int sortedData[]=sortable.sort(arr);
        return 1;
    }
    public int findMax(){
        //sort
        int sortedData[]=sortable.sort(arr);
        System.out.println("callingd findMax method");
        return 1;
    }
}
public class NeedOfSDP {
    public static void main(String[] args) {
        MathsLib mathsLib=new MathsLib();
        mathsLib.setSortable(new MergeSortStrategy());
        mathsLib.findMax();
    }
}
