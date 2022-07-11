package UC1_CreateEmployeePayroll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeePayrollTest {
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

