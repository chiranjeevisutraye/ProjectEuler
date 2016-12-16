package org.euler.basic;

public class Multiples {
	public void multiples() {
		int result=0;
		for(int i=0;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				result=result+i;
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiples m = new Multiples();
		m.multiples();
	}
}
