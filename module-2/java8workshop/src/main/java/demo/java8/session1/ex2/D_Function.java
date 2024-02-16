package demo.java8.session1.ex2;
//A-> B

import java.util.function.BiFunction;
import java.util.function.Function;
class EmpData{
    private int id;
    private double salary;

    public EmpData(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmpData{");
        sb.append("id=").append(id);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}

class Emp{
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class D_Function {
    public static void main(String[] args) {

        //Employee -> salary
       // Emp e1=new Emp(1,"raj",7000);

       // Function<Emp, Double> f4= emp-> emp.getSalary();

        //data processing pipe line ka code ...
        // function
        //x->y


        //"rajiv"--> 5
        Function<String,Integer> f1= new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        //x-> x+10
        Function<Integer, Integer> f2=x-> x+10;

        System.out.println(f2.apply(50));

        //x, y => x+y
        BiFunction<Integer, Integer, Integer> f3=( a,  b)-> a+b;




    }
}
