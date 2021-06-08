package class2;


import java.util.*;


public class a2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int count = 0;
		String ans = sc.next();
	
		for(int i = 0; i < s.length; i++) {
			ans = ans.replaceAll(s[i], "*");
		}
		System.out.print(ans.length());
		// TODO Auto-generated method stub

	}

}
