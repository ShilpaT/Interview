package com.example.interview;

public class CustomHashSetUtil {

    public static void main(String [] args){

        Employee e1 = new Employee("101","Joe", "Doe");
        Employee e2 = new Employee("201","Mike", "Done");
        Employee e3 = new Employee("301","Mary", "Smith");
        Employee e4 = new Employee("401","Joe", "Doe");
        Employee e5 = new Employee("102","John", "Miller");

        CustomHashSet<Employee> hashSet = new CustomHashSet<>(5);
        System.out.println( e1 + " added -> " + hashSet.add(e1));
        System.out.println( e2 + " added -> " + hashSet.add(e2));
        System.out.println( e3 + " added -> " + hashSet.add(e3));
        System.out.println( e4 + " added -> " + hashSet.add(e4));
        System.out.println( e5 + " added -> " + hashSet.add(e5));

        hashSet.display();

    }
}
