package org.euler.basic;

import java.math.BigInteger;

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
	public boolean isPrime(long key) {
		for(long i=2;i<key;i++) {
			if(key%i==0) {
				return false;
			}
		}
		return true;
	}
	
	/*public int largePrimeFactor() {
		//Long key = "600851475143";
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimePosition pp = new PrimePosition();
		System.out.println(pp.primePos(10001));
	}

}
