package bronze1;


import java.util.*;


public class a9933 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s[] = new String[n];
		String result = "";
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		
		for(int i = 0; i < s.length; i++) {
			StringBuffer sb = new StringBuffer(s[i]);
			String ans = sb.reverse().toString();
			for(int j = 0; j < s.length; j++) {
				if(ans.equals(s[j])) {
					result = s[j];
				}
			}
			
		}
		System.out.print(result.length()+" "+result.charAt(result.length()/2));
		// TODO Auto-generated method stub

	}

}
