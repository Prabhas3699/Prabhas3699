
public class CaseStatement {

	public static void main(String[] args) {
		
		int Full_Day_Hour = 1;
		int Emp_Full_Hour = 8;
		int Part_Time_Hour = 2;
		int Emp_Part_Hour = 4;
		int Emp_Day_Hour = 0;
		int EmployeeAbsent = 0;
		int Wage_Per_Hour = 20;
		
		
		int empCheck = (int)(Math.floor(Math.random()*10)%3);
		
		switch(empCheck) {
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage ="+ Wage_Per_Hour*Emp_Full_Hour);
			break;
		case 2:
			System.out.println("Employee is Part Time");
			System.out.println("Employee Daily Wage ="+ Wage_Per_Hour*Emp_Part_Hour);
			break;
		case 3:
			System.out.println("Employee is Absent");
			System.out.println("Employee Daily Wage ="+EmployeeAbsent);
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
