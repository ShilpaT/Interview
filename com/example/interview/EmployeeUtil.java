package com.example.interview;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class FirstNameComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){
        return o1.getFirstName().compareTo(o2.getFirstName()) ;
    }
}

class LastNameComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.getLastName().compareTo(o2.getLastName()) ;
    }
}


public class EmployeeUtil {


    public static void main(String[] args){

        Employee e1 = new Employee("101","Joe", "Doe");
        Employee e2 = new Employee("201","Mike", "Done");
        Employee e3 = new Employee("301","Mary", "Smith");
        Employee e4 = new Employee("401","Don", "M");
        Employee e5 = new Employee("102","John", "Miller");

        Set<Employee> employeeSet = new TreeSet<>(new FirstNameComparator());
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);
        employeeSet.forEach(System.out:: println);

        System.out.println("-----------------------------------------");

        Set<Employee> employeeSetTwo = new TreeSet<>(new LastNameComparator());
        employeeSetTwo.add(e1);
        employeeSetTwo.add(e2);
        employeeSetTwo.add(e3);
        employeeSetTwo.add(e4);
        employeeSetTwo.add(e5);
        employeeSetTwo.forEach(System.out:: println);
    }
}
