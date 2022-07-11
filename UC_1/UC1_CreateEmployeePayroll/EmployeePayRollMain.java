package UC1_CreateEmployeePayroll;

public class EmployeePayRollMain {

	public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Welcolme to the Employee_Payroll_Services");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
  
	}
	
	

}
