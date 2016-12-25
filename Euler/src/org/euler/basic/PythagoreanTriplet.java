package org.euler.basic;

public class PythagoreanTriplet {
	int x,y,z;
	public void fn() {
		for(int a=0;a<=1000;a++) {
			for(int b=a+1;b<=1000;b++) {
				for(int c=b+1;c<=1000;c++) {
					if((a+b+c==1000)) {
						long val1 = (long) Math.pow(a, 2);
						long val2 = (long) Math.pow(b, 2);
						long valc = (long) Math.pow(c, 2);
						if(val1+val2==valc) {
							long val = (long) (a*b*c);
							System.out.println(val);
						}
						
					}
				}
			}
		}
	}
	
	public void tripletShortCut() {
		//A triplet is nothing but a^2+b^2=c^2;
		//Easy way to find a triplet is that if a number is odd divide by 2
		//then its floor and ceil along with it become triplets
		for(int i=0;i<1000;i++) {
			if(isEven(i)) {
				int floor = (int) Math.floor((i/2));
				int ceil = (int) Math.ceil((i/2));
				if(isTriplet(i, floor, ceil)) {
					System.out.println(i+" "+floor+" "+ceil);
				}
			}
		}
	}
	
	public boolean isTriplet(int i, int floor, int ceil) {
		return (Math.pow(i, 2)+Math.pow(floor, 2)==Math.pow(ceil, 2));
	}
	
	public boolean isEven(int i) {
		return i%2==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PythagoreanTriplet pt = new PythagoreanTriplet();
		//pt.fn();
		pt.tripletShortCut();
	}

}
