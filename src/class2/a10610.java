package class2;


import java.util.*;


public class a10610 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int ans[] = new int[10];
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < 10; j++) {
			if(s.charAt(i) - '0' == j) {
				ans[j]++;
			}
			}
			result += s.charAt(i) - '0';
		}
		
		if(!s.contains("0") || !(result % 3 == 0)) {
			System.out.print(-1);
			return;
		}
		
		for(int i = 9; i >= 0; i--) {
			while(ans[i] --> 0) {
				sb.append(i);
			}
		}
		System.out.print(sb.toString());
		
		
		
			// TODO Auto-generated method stub

	}

}
