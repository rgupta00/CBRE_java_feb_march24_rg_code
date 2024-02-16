package demo.java8.session1.ex2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
class Emp1{
    private int id;
    private String name;
    private double salary;

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

    public Emp1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp1{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
public class FunctionalInerfaceInJava {
    public static void main(String[] args) {
        Predicate<String>p1= name-> name.contains("raj");
        Predicate<String>p2= name-> name.length()>5;

        Predicate<String>p3=p1.and(p2).negate();
        System.out.println(p3.test("foo"));


        //if emp is getting salary > 500_000 then rich emp
//        Predicate<Emp1> p4=emp-> emp.getSalary()>=500_000;

        //ref               peice of code
        Predicate<Emp1> p4= e -> e.getSalary()>=500_000;

        Emp1 e1=new Emp1(1,"raj",200_000);

        System.out.println(p4.test(e1));

        BiPredicate<Integer, Integer> p5=( n1,  n2)-> n1>n2;

        Predicate<Integer> p6=data-> data%2==0;



    }
}
