package com.learning;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRecords {
    private Map<Employee, String> employeeStringMap;

    public EmployeeRecords() {
        this.employeeStringMap = new HashMap<>();
    }

    public void addEmployeeRecord( Employee employee, String employeeNation ) {
        this.employeeStringMap.put( employee, employeeNation );
    }

    public Map<Employee, String> getEmployeeRecords() {
        return employeeStringMap;
    }
}
