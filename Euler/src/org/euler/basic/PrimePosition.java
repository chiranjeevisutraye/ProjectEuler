package org.euler.basic;

public class PrimePosition {
	public int primePos(int pos) {
		int i=2;
		while(pos!=0) {
			if(isPrime(i)) {
				pos--;
			}
			i++;
		}
		return i-1;
	}
	public boolean isPrime(int key) {
		for(int i=2;i<key;i++) {
			if(key%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimePosition pp = new PrimePosition();
		System.out.println(pp.primePos(10001));
	}

}
