package com.example.interview;

public class Employee {

    private String empId;
    private String firstName;
    private String lastName;

    public Employee(String id, String fName, String lName){
        this.empId = id;
        this.firstName = fName;
        this.lastName = lName;
    }
    public String getEmpId(){
        return this.empId;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int compareTo(Employee e){
        return this.getEmpId().compareTo(e.getEmpId()) ;
    }

    public String toString(){
        return "Employee Id "  + this.getEmpId() +
                " First name : " + this.getFirstName() +
                " Last Name : " + this.getLastName();
    }

    public boolean equals(Object o){

        if(o instanceof  Employee &&
                ((Employee)o).getFirstName().equals(this.getFirstName()) &&
                ((Employee)o).getLastName().equals(this.getLastName())){
                return true;
        }else
                return false;
    }

    public int hashCode(){
        int code =0;
        for(int c = 0 ; c < empId.length(); c++)
            code += (int)c;
        return code;
    }
}
