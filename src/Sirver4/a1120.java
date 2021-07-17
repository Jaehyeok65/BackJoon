package Sirver4;


import java.util.*;


public class a1120 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();  // a < b
		
		int max = 0;
		int i = 0;
		int result = 0;
		while(true) {
			int count = 0;
			if(i + a.length() > b.length()) {
				break;
			}
			String ans = b.substring(i,i + a.length());
			i++;
			for(int j = 0; j < ans.length(); j++) {
				if(ans.charAt(j) == a.charAt(j)) {
					count++;
				}
			}
			max = Math.max(max, count);
		}
		result = a.length() - max;
		System.out.print(result);
		
		
		
		// TODO Auto-generated method stub

	}

}
