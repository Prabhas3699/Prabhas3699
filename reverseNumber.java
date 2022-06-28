
public class reverseNumber {

	public static void main(String[] args) {
		
		int num = 123;
		int rev=0;
		//int i;
		
		while(num>0) {
			//i=num%10;
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
