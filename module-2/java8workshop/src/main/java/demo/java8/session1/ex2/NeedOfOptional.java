package demo.java8.session1.ex2;

import java.util.Optional;
import java.util.function.Supplier;

class EmpNotFoundEx extends RuntimeException{
    public EmpNotFoundEx(String message) {
        super(message);
    }
}

public class NeedOfOptional {
    public static void main(String[] args) {

        //something more about optional
        Emp e=null;
//        Optional<Emp> eOpt=Optional.of(e);//dabba can not hold null
//        Optional<Emp> eOpt=Optional.ofNullable(e);//dabba can not hold null object

        Optional<Emp> eOpt2=Optional.empty();

        Emp temp=eOpt2.orElseThrow(()-> new EmpNotFoundEx("emp not found"));



       //Emp e2=eOpt.get();//NoSuchElementException bad code using get method

//        if(eOpt.isPresent()){
//            Emp e3=eOpt.get();
//        }else {
//            System.out.println("not found");
//        }







        //raj
        int id=33;
//        Optional<Emp>  eOpt=getById(id);
//
////        String name=eOpt.map(e->e.getName()).orElse("emp not found");
//        String name=eOpt.map(e->e.getName())
//                .orElseThrow(()-> new EmpNotFoundEx("emp is not found "+id));
//        System.out.println(name);

    }

    //kapil
    public static Optional<Emp> getById(int id){
      //data base intraction

    //kali dabba with null
      return  Optional.ofNullable(null);//*
    }
}
