
public class PartTime {

	public static void main(String[] args) {
		
		int Full_Day_Hour = 1;
		int Emp_Full_Hour = 8;
		int Part_Time_Hour = 2;
		int Emp_Part_Hour = 4;
		int EmployeeAbsent = 0;
		int Wage_Per_Hour = 20;
		
		double empCheck = Math.floor(Math.random()*10)%3;
		
		if(empCheck == Full_Day_Hour) {
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage ="+ Wage_Per_Hour*Emp_Full_Hour);
		}else if (empCheck == Part_Time_Hour) {
			System.out.println("Employee is Part Time");
			System.out.println("Employee Daily Wage ="+ Wage_Per_Hour*Emp_Part_Hour);
		}else {
			System.out.println("Employee is Absent");
			System.out.println("Employee Daily Wage =" +EmployeeAbsent);
		}


	}

}
