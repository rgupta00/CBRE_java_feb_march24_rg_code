package com.session1;
class Marker{
    public  void write(){
        System.out.println("writing with marker");
    }
}
class LunchBox{
    public  void write(){
        System.out.println("writing with marker");
    }
}

//Trainer eat the food at lunch time and teach using marking on wb
class Trainer{
    public void teachOnWB(Marker marker){
        marker.write();
    }
    public void eatingLunch(){
        LunchBox lunchBox=new LunchBox();
        lunchBox.write();
    }
}
//NS
//class Trainer extends Marker{
//    private Marker marker=new Marker();
//
//
//}

//NS
//class Trainer{
//    private Marker marker=new Marker();
//    private LunchBox lunchBox=new LunchBox();
//
//
//}
public class G_UsaEx{
    public static void main(String[] args) {
        Marker marker=new Marker();
        Trainer trainer=new Trainer();
        trainer.teachOnWB(marker);
        /*
            USA-A
            HAS A
            IS A
         */
    }
}
