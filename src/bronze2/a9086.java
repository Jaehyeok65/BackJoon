package bronze2;


import java.util.*;


public class a9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.length() == 1) {
				System.out.print(s.substring(0,1)+s.substring(0,1));
			}
			else {
				System.out.print(s.substring(0,1));
				System.out.print(s.substring(s.length()-1));
			}
			System.out.println("");
		}
		// TODO Auto-generated method stub

	}

}
