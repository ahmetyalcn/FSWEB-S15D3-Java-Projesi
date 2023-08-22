package com.workintech.maps.main;

import com.workintech.maps.model.Employee;
import com.workintech.maps.model.EmployeeChecker;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Zeynep", "Vural");
        Employee employee2 = new Employee(2,"Ann", "Ann");
        Employee employee3 = new Employee(3,"Bob", "Bob");
        Employee employee4 = new Employee(4,"Ahmet", "Ahmet");
        Employee employee5 = new Employee(4,"Carol", "Carol");
        Employee employee6 = new Employee(6,"Ayşe", "Senel");
        Employee employee7 = new Employee(1,"Can", "Duman");
        Employee employee8 = new Employee(7,"Zeynep", "Vural");

        LinkedList<Employee> allEmployeeList= new LinkedList<>();
        allEmployeeList.add(employee1);
        allEmployeeList.add(employee2);
        allEmployeeList.add(employee3);
        allEmployeeList.add(employee4);
        allEmployeeList.add(employee5);
        allEmployeeList.add(employee6);
        allEmployeeList.add(employee7);
        allEmployeeList.add(employee8);
        EmployeeChecker employeeChecker = new EmployeeChecker();
        employeeChecker.checkEmployee(allEmployeeList);

    }
}