package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

interface SumofSalaries {
    double sum(Employee[] employees);
}

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
class Employeee {
    int empId;
    String name;
    double salary;
}

class Sum {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "A", 50000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 60000),
                new Employee(4, "D", 80000),
                new Employee(5, "E", 90000)
        };

        SumofSalaries sumofSalary = (emps) -> emps[0].getSalary() + emps[emps.length - 1].getSalary();

        System.out.println("Sum of salaries of 1st and last employee is: " + sumofSalary.sum(employees));
    }
}