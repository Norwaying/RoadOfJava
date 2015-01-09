package com.raphael.object;

import java.util.Date;

/**
 * Created by Nov on 2015/1/9.
 */
public class Employee {
    String name;
    int salary;
    Date hireDay;

    public Employee(String name, int salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public boolean equals(Object otherObj){
        //快速测试是否是同一个对象
        if(this == otherObj) return true;
        //如果显式参数为null，必须返回false
        if(otherObj == null) return false;
        //如果类不匹配，就不可能相等
        if(getClass() != otherObj.getClass()) return false;

        //现在已经知道otherObj是个非空的Employee对象
        Employee other = (Employee)otherObj;
        //测试所有的字段是否相等
        return name.equals(other.name)&& salary == other.salary && hireDay.equals(other.hireDay);
    }

    public String toString(){
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
