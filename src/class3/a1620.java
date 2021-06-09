package class3;


import java.util.*;


public class a1620 {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		HashMap<String,String> hash = new HashMap<>();
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			String ans = sc.next();
			hash.put(String.valueOf(i), ans);
			hash.put(ans,String.valueOf(i));
		}
		
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			sb.append(hash.get(s)+"\n");
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
