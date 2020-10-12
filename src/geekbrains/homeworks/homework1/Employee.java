package geekbrains.homeworks.homework1;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo(){
        System.out.println("Employee's name: " + name + ". Position: " + position + ". Contacts: Email: " + email + ". Phone Number" +
                phoneNumber + ". Salary: " + salary + ". Age: " + age);
    }
    public void printOlderThen40(){
        if(this.age >= 40){
            System.out.println("Employee older than 40 y.o.: " + name + ". Age: " + age);
        }
    }
}
