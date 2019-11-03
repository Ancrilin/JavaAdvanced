package cn.edu.scau.yuki.Thread;

public class main {

	public static void main(String[] args){
		int a[] = new int[100];
		for(int i=0;i<100;i++) {
			a[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<100;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		SortThread sort1 = new SortThread(0,24,a);
		sort1.start();
		SortThread sort2 = new SortThread(25,49,a);
		sort2.start();
		SortThread sort3 = new SortThread(50,74,a);
		sort3.start();
		SortThread sort4 = new SortThread(75,99,a);
		sort4.start();
		while(!(sort1.getFlag()&&sort2.getFlag()&&sort3.getFlag()&&sort4.getFlag())) {
			
		}
		SortThread sort5 = new SortThread(0,49,a);
		sort5.start();
		SortThread sort6 = new SortThread(50,99,a);
		sort6.start();
		while(!(sort5.getFlag()&&sort6.getFlag())) {
			
		}
		SortThread sort7 = new SortThread(0,99,a);
		sort7.start();
		while(!sort7.getFlag()) {
			
		}
		System.out.println("result");
		for(int i=0;i<100;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

class SortThread extends Thread{
	int l,r;
	int s[];
	int a[];
	int n;
	boolean flag = false;
	public SortThread(int l, int r, int a[]) {
		this.l = l;
		this.r = r;
		this.n = r - l + 1;
		this.a = a;
		s = new int[n];
		int t = l;
		for(int i=0;i<n;i++) {
			s[i]=a[t];
			t++;
		}
	}

	public void show() {
		for(int i=0;i<n;i++)
			System.out.print(s[i]+" ");
		System.out.println();
	}
	
	private void in() {
		int t = l;
		for(int i=0;i<n;i++) {
			a[t] = s[i];
			t++;
		}
		flag = true;
	}
	
	public boolean getFlag() {
		return this.flag;
	}
	
	@Override
	public void run() {
		sort();
		in();
	}
	
	private void sort() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(s[j]>s[j+1]) {
					int t = s[j];
					s[j] = s[j+1];
					s[j+1] = t;
				}
			}
		}
	}
	
}
