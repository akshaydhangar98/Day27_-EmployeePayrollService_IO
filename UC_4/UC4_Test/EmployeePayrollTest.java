package UC4_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import UC4_StorePayroll.EmployeeData;
import UC4_StorePayroll.EmployeePayrollService;

class EmployeePayrollTest {

	@Test
	 public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.addEmployee(new EmployeeData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeeData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeeData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        long entries = employeePayrollService.countEntries();
        assertEquals(3, entries);
    }
}