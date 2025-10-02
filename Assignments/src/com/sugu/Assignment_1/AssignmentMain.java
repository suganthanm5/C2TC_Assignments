package com.sugu.Assignment_1;

import com.sugu.Assignment_1.employees.Developer;
import com.sugu.Assignment_1.employees.Manager;
import com.sugu.Assignment_1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Creating Manager Object
        Manager manager = new Manager("Arun", 101, 120000, "HR");
        
        // Creating Developer Objects
        Developer developer = new Developer("Kumar", 102, 80000, "Java");

        // Creating Utility Object
        EmployeeUtilities util = new EmployeeUtilities();

        // Display Details
        
        util.printEmployeeDetails(manager);
        util.printEmployeeDetails(developer);
        

        // Update Salary Using Protected Method
        util.updateSalary(manager, 95000);
        util.updateSalary(developer, 80000);
    }
}