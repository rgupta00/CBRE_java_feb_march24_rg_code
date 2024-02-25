package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;

public class B_ShowAll {
    public static void main(String[] args) {

        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();//openSession vs getCurrentSession
        //ORM u will talk to hib in terms of object=> HQL(hib query lang)
        //i want to read all the records
        //orm
//        List<Employee> employeeList=session.createQuery("select e from Employee e", Employee.class).getResultList();
//        employeeList.forEach(e-> System.out.println(e));

//        List<String> employeeList=session.createQuery("select e.name from Employee e", String.class).getResultList();
//        employeeList.forEach(e-> System.out.println(e));

//        List<Object[]> employeeList=session.createQuery("select e.name, e.salary from Employee e", Object[].class).getResultList();
//
//        for(Object[] object: employeeList){
//            System.out.println(object[0]+": "+ object[1]);
//        }

//        List<EmployeeSelectedDataDto> employeeList=session.createQuery
//                ("select new com.empapp.basics.EmployeeSelectedDataDto(e.name, e.salary) from Employee e",
//                EmployeeSelectedDataDto.class).getResultList();
//
//        employeeList.forEach( e-> System.out.println(e));


        session.close();
        sessionFactory.close();

    }
}
