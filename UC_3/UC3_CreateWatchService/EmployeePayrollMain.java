package UC3_CreateWatchService;

public class EmployeePayrollMain {
	
	public static void main(String[] args) {
		System.out.println("..WELCOME TO EMPLOYEE PAYROLL SYSTEM..");
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();

		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}

}
