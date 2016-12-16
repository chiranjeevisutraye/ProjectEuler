package org.euler.basic;

public class Fibonnaci {
	int n1=0,n2=1,n3=0;
	static int result=0;
	public void fib(int count) {
		if(count>0 && n3<4000000) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			if(n3%2==0) {
				result= result+n3;
			}
			System.out.print(" "+n3);
			fib(count-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fibonnaci().fib(100000000);
		System.out.println(" result "+result);
	}

}
