package com.session2.demo1.c.relationship_bw_objects;

//Marker --- >Trainer
class  Marker{
    public void write(){
        System.out.println("drawing using marker");
    }
}
class Trainer {
    //Use A
    public void teach(Marker marker){
        System.out.println("teaching basics oops");
        marker.write();
    }
}
public class C_UseA {

    public static void main(String[] args) {
        Marker marker=new Marker();
        Trainer trainer=new Trainer();
        trainer.teach(marker);

        Trainer trainer2=new Trainer();
        trainer2.teach(marker);

    }
}
