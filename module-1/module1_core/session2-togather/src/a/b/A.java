package a.b;

 public class A {
   private  int i=1;
      int j=11;
    protected   int k=111;
    public   int l=1111;

    private void privateMethod(){
        System.out.println("hello");
    }

    protected void protectedMethod(){
        System.out.println("protected");
    }

     void defaultMethod(){
        System.out.println("default");
    }

    public void publicMethod(){
        System.out.println("public");
    }

}
