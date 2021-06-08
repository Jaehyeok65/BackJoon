package bronze1;


import java.util.*;


public class a1032 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s[] = new String[n];
		boolean dfs = false;
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		
		for(int i = 0; i < s[0].length(); i++) {
			dfs = false;
			for(int j = 0; j < s.length; j++) {
				if(j == s.length - 1) break;
				if(s[j].charAt(i) != s[j+1].charAt(i)) {
					dfs = true;
					break;
				}
			}
			if(dfs == true) {
				System.out.print("?");
			}
			else {
				System.out.print(s[0].charAt(i));
			}
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
