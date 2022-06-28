
public class PerfectNumber {

	public static void main(String[] args) {
		
		int num = 28;
		int perfect=0;
		
		for(int i=1; i<=(num/2);i++ ) {
			if(num%i == 0) {
				perfect=perfect+i;
				System.out.println(perfect);
			}
		}if(num == perfect) {
			System.out.println("The Number is prefect");
		}else {
			System.out.println("The Number is not prefect");
		}
	}
}
