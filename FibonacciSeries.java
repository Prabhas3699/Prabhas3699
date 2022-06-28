
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int length=8;
		int nextNum;
		
		for (int i =0 ; i<length ; i++) {
			System.out.println(num1);
			nextNum=num1+num2;
			num1=num2;
			num2=nextNum;			
		}

	}

}
