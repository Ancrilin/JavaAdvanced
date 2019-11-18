package work03;

import java.util.List;
import java.util.concurrent.Callable;

public class PrimeThread implements Callable<Integer>{
	private Integer left;
	private Integer right;
	private JudgePrime judgePrime = new JudgePrime();
	
	public PrimeThread(Integer left, Integer right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public Integer call() throws Exception {
		Integer num = new Integer(0);
		for(int i=left;i<=right;i++) {
			if(judgePrime.isPrime(i)) {
				num++;
			}
		}
		return num;
	}
	
}
