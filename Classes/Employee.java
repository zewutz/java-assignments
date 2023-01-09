package Classes;

import java.util.Date;


/* Classes.Employee super class */
public class Employee {
    private String name;
    private double salary;
    private Date hireDate;
    private String department;


    public Employee(String name, double salary, Date hireDate, String department) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

/* Classes.Manager subclass */
class Manager extends Employee {
    private int numOfSubords;

    public Manager(String name, double salary, Date hireDate, String department, int numOfSubords) {
        super(name, salary, hireDate, department);
        this.numOfSubords = numOfSubords;
    }

    public int getNumOfSubords() {
        return this.numOfSubords;
    }

    public void setNumOfSubords(int numOfSubords) {
        this.numOfSubords = numOfSubords;
    }
}

class Developer extends  Employee {
    private String lang;

    public Developer(String name, double salary, Date hireDate, String department, String lang) {
        super(name, salary, hireDate, department);
        this.lang = lang;
    }

    public String getLang(){
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}


