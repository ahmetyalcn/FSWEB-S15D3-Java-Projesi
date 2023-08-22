package com.workintech.maps.model;

import java.util.*;

public class EmployeeChecker{

    public void checkEmployee(LinkedList<Employee> employees) {
        List<Employee> allEmployees = new LinkedList<>(employees);
        Set<Employee> removeDuplicate = new HashSet<>();
        Map<Integer, Employee> uniqueMap = new HashMap<>();

        for (Employee employee : employees) {
            if (uniqueMap.containsKey(employee.getId())) {
                removeDuplicate.add(employee);
            } else {
                uniqueMap.put(employee.getId(), employee);
            }
        }

        allEmployees.removeAll(removeDuplicate);

        System.out.println("Duplicate Employees:");
        for (Employee duplicate : removeDuplicate) {
            System.out.println(duplicate);
        }

        System.out.println("Unique Employees:");
        for (Map.Entry<Integer,Employee> entry : uniqueMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("New List:");
        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }

    }

}
