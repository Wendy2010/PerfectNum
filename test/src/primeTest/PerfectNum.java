package primeTest;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int min = in.nextInt();
		int max = in.nextInt();
		String result="";
		int i = min;
		for(; i < max; i++) {
			if (isPerfect(i)) {
				if (result.length() == 0) {
					result += i;
				}else {
					result += " " + i;
				}
			}
		}
		if (result.length() == 0) {
			result = "NIL";
		}
		System.out.println(result);
	}
	
	public static boolean isPerfect(int num) {
		int sum = 0;
		int i = 1;
	       
		 for(; i < num; i++){
		     if (num % i == 0){ // 可以整除
		    	 	sum += i;
		     }
		     
		 }
		 return sum == num;
	}
}