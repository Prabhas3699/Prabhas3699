
public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean prime = true;
		int n = (int)Math.floor(Math.random()*100)+1;
		
		for (int i=0; i<=n; i++){
			if (n%i == 0) {
				prime=false;
			}System.out.println("the number is " + prime);
		}

	}

}
