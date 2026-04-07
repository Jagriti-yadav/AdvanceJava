package streamapi;

import java.util.*;

public class MapStudentDTO {

    // Employee class
    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }
    }

    // DTO class
    static class EmployeeDTO {
        String name;

        EmployeeDTO(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("ankit"));
        list.add(new Employee("rahul"));

        System.out.println(list);  // will print object references

        List<EmployeeDTO> empName = list.stream()
                .map(emp -> new EmployeeDTO(emp.name))
                .toList();

        System.out.println(empName); // also prints references
    }
}


