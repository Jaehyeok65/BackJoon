package bronze1;


import java.util.*;


public class a9093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < T; i++) {
			String s = sc.nextLine();
			String s1[] = s.split(" ");
			for(int j = 0; j < s1.length; j++) {
				StringBuffer sb1 = new StringBuffer(s1[j]);
				String a = sb1.reverse().toString();
				System.out.print(a+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
