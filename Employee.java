package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

interface EmployeeSort {
    void sort(Employee[] employees);
}

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
class Employee {
    int empId;
    String name;
    double salary;

}

class SortEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "A", 50000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 60000),
                new Employee(4, "D", 80000),
                new Employee(5, "E", 75000)
        };

        EmployeeSort sortSalaries = (emps) -> {
            for (int i = 0; i < emps.length - 1; i++) {
                for (int j = i + 1; j < emps.length; j++) {
                    if (emps[i].salary < emps[j].salary) {
                        Employee temp = emps[i];
                        emps[i] = emps[j];
                        emps[j] = temp;
                    }
                }
            }
            for (Employee e : emps) System.out.println(e.toString());
        };

        sortSalaries.sort(employees);
    }
}
