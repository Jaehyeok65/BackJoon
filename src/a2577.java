

import java.util.*;


public class a2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		char arr[] = {'0','1','2','3','4','5','6','7','8','9'};
		int count[] = {0,0,0,0,0,0,0,0,0,0};
		
		long result = a*b*c;
		String sresult = String.valueOf(result);
		for(int i = 0; i < sresult.length(); i++) {
			char ca = sresult.charAt(i);
			for(int j = 0; j < arr.length; j++) {
				if(ca == arr[j]) {
					count[j]++;
				}
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
