package work03;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CaculateNumOfPrime {
	public static Integer num = new Integer(0);
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		ExecutorService executor = Executors.newCachedThreadPool();
		System.out.println("输入要求素数个数的范围：");
		int left = input.nextInt();
		int right = input.nextInt();
		int path = (right - left) / 4;
		PrimeThread t1 = new PrimeThread(left, left + path);
		left += left + path;
		PrimeThread t2 = new PrimeThread(left, left + path);
		left += left + path;
		PrimeThread t3 = new PrimeThread(left, left + path);
		left += left + path;
		PrimeThread t4 = new PrimeThread(left, right + 1);
		FutureTask<Integer> task1 = new FutureTask<>(t1) ; 
		FutureTask<Integer> task2 = new FutureTask<>(t2) ; 
		FutureTask<Integer> task3 = new FutureTask<>(t3) ; 
		FutureTask<Integer> task4 = new FutureTask<>(t4) ; 
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		executor.submit(task4);
		num+=task1.get();
		System.out.println(num);
		num+=task2.get();
		System.out.println(num);
		num+=task3.get();
		System.out.println(num);
		num+=task4.get();
		System.out.println(num);
		executor.shutdown();
	}
}
