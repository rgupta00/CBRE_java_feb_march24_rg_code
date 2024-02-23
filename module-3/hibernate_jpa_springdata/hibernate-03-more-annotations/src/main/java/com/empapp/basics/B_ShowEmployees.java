package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class B_ShowEmployees {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the session factory
        SessionFactory sessionFactory= SessionFactoryUtil.getSessionFactory();

        //2. get the session from the session factory
        Session session=sessionFactory.openSession();//openSession() vs getCurrentSession()

        //3. u dont need to start the tx while reading the records
        //ORM HQL
        //------------for getting the empls records-------------------
//        List<Employee> employees=session.createQuery("select e from Employee e",Employee.class).getResultList();
//
//        employees.forEach(e-> System.out.println(e));


//        //------------for getting the names only ie Projection op in db-------------------
//        List<String> employeesNames=session.createQuery("select e.name from Employee e",String.class).getResultList();
//        employeesNames.forEach(name-> System.out.println(name));

        //------------for getting the names only ie Projection op in db-------------------
//        List<Object[]> employeesNamesAndSalary=session
//                .createQuery("select e.name, e.salary from Employee e",Object[].class).getResultList();
//
//        for(Object[] obArray: employeesNamesAndSalary){
//            System.out.println(obArray[0]+": "+ obArray[1]);
//        }

        //EmployeeSelectedDataDto this to hold the selected data
        List<EmployeeSelectedDataDto> employeesNamesAndSalary=session
                .createQuery("select new com.empapp.basics.EmployeeSelectedDataDto(e.name, e.salary) from Employee e",
                        EmployeeSelectedDataDto.class).getResultList();

        for(EmployeeSelectedDataDto ob: employeesNamesAndSalary){
            System.out.println(ob.getName()+": "+ ob.getSalary());
        }

        session.close();

        sessionFactory.close();



    }
}
