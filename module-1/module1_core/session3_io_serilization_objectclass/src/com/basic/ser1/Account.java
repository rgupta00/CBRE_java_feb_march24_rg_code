package com.basic.ser1;

import java.io.Serializable;

public class Account implements Serializable {
     int id;
     String name;
     double salary;
     static  String bankName="SBI";// staitc varaible dont particapte in the Ser....

    public Account(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
