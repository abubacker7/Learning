package com.learning;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeRecordsTest {
    public EmployeeRecords employeeRecords;
    public Employee emp1;
    public Employee emp2;
    public Employee emp3;

    @BeforeAll
    void setUp() {
        employeeRecords = new EmployeeRecords();
        emp1 = new Employee( 528, "john", "Manager" );
        emp2 = new Employee( 956, "alex", "HR" );
        emp3 = new Employee( 956, "alex", "HR" );
        employeeRecords.addEmployeeRecord( emp1, "us" );
        employeeRecords.addEmployeeRecord( emp2, "brazil" );
        employeeRecords.addEmployeeRecord( emp3, "india" );
    }

    @AfterAll
    void tearDown() {
        employeeRecords = null;
        emp1 = null;
        emp2  = null;
        emp3  = null;
    }

    @Test
    void getEmployeeStringMap() {
        // Size Should be equal because both emp2 & emp3 employee object has same employeeId
        Assertions.assertEquals( 2, employeeRecords.getEmployeeRecords().size() );

        // Both emp2 and emp3 are hascode should be same both key values are same
        Assertions.assertTrue( employeeRecords.getEmployeeRecords().get( emp2 ).hashCode() == employeeRecords.getEmployeeRecords().get( emp3 ).hashCode() );

        // Both emp1 and empe aren't hascode because both object key are different
        Assertions.assertTrue( employeeRecords.getEmployeeRecords().get( emp1 ).hashCode() != employeeRecords.getEmployeeRecords().get( emp2 ).hashCode() );

        // Both emp2 & emp3 are same because it has same key
        Assertions.assertTrue( employeeRecords.getEmployeeRecords().get(emp2).equals( employeeRecords.getEmployeeRecords().get(emp3) ) );

        // Both emp1 & emp3 are not same because it has different key
        Assertions.assertFalse( employeeRecords.getEmployeeRecords().get(emp1).equals( employeeRecords.getEmployeeRecords().get(emp3) ) );
    }
}