package bronze2;


import java.util.*;


public class a1096 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String color[] = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		String ans[] = {"0","1","2","3","4","5","6","7","8","9"};
		long ans1[] = new long[10];
		for (int i = 0; i < ans1.length; i++) {
			ans1[i] = (int)Math.pow(10, i);
		}
		
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String result1 = "";
		String result2 = "";
		long multi = 0;
		long result = 0;
		for(int i = 0; i < ans.length; i++) {
			if(s1.equals(color[i])) {
				result1 = ans[i];
			}
			if(s2.equals(color[i])) {
				result2 = ans[i];
			}
			if(s3.equals(color[i])) {
				multi = ans1[i];
			}
		}
		String resulttemp = result1 + result2;
		result = Long.parseLong(resulttemp)*multi;
		System.out.print(result);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
