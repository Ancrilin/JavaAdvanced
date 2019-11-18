package work03;

public class JudgePrime {
	
	public boolean isPrime(int num) {
		boolean result = true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
}
