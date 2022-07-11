package UC1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import UC1_CreateEmployeePayroll.EmployeeData;
import UC1_CreateEmployeePayroll.EmployeePayrollService;

class EmployeePayrollTest {

	@Test
	 public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.addEmployee(new EmployeeData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeeData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeeData(3, "Mark Z", 30000));
        System.out.println();
        employeePayrollService.writeEmployeeDataInConsole();
        long entries = employeePayrollService.countEntries();
        assertEquals(3, entries);
    }
}