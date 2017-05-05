package com.java.leetCode;
import java.util.*;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class demo {

	public static void main(String[] args) {
		LinkedHashSet<Test> s = new LinkedHashSet<Test>();
		s.add(new Test(1, 2, 3));
		s.add(new Test(1, 2, 3));
		s.add(new Test(1, 2, 3));
		// System.out.println(s.size());
//		if (isHappy(4) == true)
//			System.out.println("it's a happy number");
//		else
//			System.out.println("not a happy number");
		
		if(canWinNim(1348820612)==true)
			System.out.println("yesssssssss");
		else
			System.out.println("Nooooooooooo");
		
			

	}

	static public boolean canWinNim(int n) {
		return (n%4!=0);
	}

	public static boolean isHappy(int n) {
		if (n == 1 || n == -1)
			return true;
		int sum = 0;
		HashSet hs = new HashSet();
		if (hs.add(n)) {

			while (n != 0) {
				sum += (int) Math.pow(n % 10, 2);
				n = n / 10;
			}
		} else {
			return false;
		}
		if (sum == 1)
			return true;

		return isHappy(sum);

	}
}

class Test {
	public int x;
	public int y;
	public int z;

	Test(int x1, int y1, int z1) {
		this.x = x1;
		this.y = y1;
		this.z = z1;

	}

	@Override
	public boolean equals(Object obj) {
		return (this.x == ((Test) obj).x && this.y == ((Test) obj).y && this.z == ((Test) obj).z);
	}

	public int hashCode() {
		return x + y + z;
	}

}