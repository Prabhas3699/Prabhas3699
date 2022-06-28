
public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 23;
		
//		while(n<100) {
//			n++;
//			System.out.println("n" + n +"   ");
		boolean prime = true;
		for(int i=2; i<n; i++) {
			//System.out.println("i" +i);
			if (n%i == 0) {
				prime = false;
				break;
			}
			}if (prime == true){
				System.out.println("The Number is prime");
			//}else if(prime == false){
			}else {
				System.out.println("The Number is not prime");
			}
		//}

	}

}
