package org.euler.basic;

public class SumSquare {
	public void fn() {
		int sumSquare=0,squaresum=0;
		for(int i=1;i<=100;i++) {
			squaresum=squaresum+(i*i);
			sumSquare = sumSquare+i;
		}
		
		sumSquare = sumSquare*sumSquare;
		System.out.println(sumSquare-squaresum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumSquare ss = new SumSquare();
		ss.fn();
	}

}
