package com.session3.b.ex_handling;
class TryEx extends Exception {
}
class FinallyEx extends Exception {
}
public class I_SuppressedEx {

    public static void main(String[] args) {
        try{
            foo();
        }catch (Exception e){
            System.out.println(e);
           Throwable[]throwables= e.getSuppressed();
           for(Throwable t: throwables){
               System.out.println(t);
           }
        }
    }

    private static void foo()throws Exception {
        Exception t=null;
        try{
            throw  new TryEx();
        }catch (Exception ex){
            t=ex;
        }
        finally {
           FinallyEx e=new FinallyEx();
           if(t!=null){
               e.addSuppressed(t);
           }
           throw e;
        }
    }
}







