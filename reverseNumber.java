
public class reverseNumber {

	public static void main(String[] args) {
		
		int num = 123;
		int rev=0;
		
		while(num>0) {
			int i=num%10;
			rev=rev*10+i;
			num=num/10;
		}
		System.out.println(rev);
	}

}
