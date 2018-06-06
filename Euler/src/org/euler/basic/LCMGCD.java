package org.euler.basic;

public class LCMGCD {
	public void printLCM(int x, int y) {
		int gcd = getGCD(x, y);
		int lcm = (x*y)/gcd;
		System.out.println(lcm);
	}
	public int getGCD(int x, int y) {
		for(int i=1;;i++) {
			if(x%i!=0 || y%i!=0)
			return i-1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCMGCD lg = new LCMGCD();
		lg.printLCM(6, 8);

	}

}
