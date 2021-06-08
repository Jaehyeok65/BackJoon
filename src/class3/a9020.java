package class3;


import java.util.*;


public class a9020 {
	 
	static boolean sosu(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean ans[] = new boolean[10001];
		ans[0] = true;
		ans[1] = true;
		int result = 0;
		for(int i = 2; i <= Math.sqrt(ans.length); i++) {
			if(ans[i]) {
				continue;
			}
			if(sosu(i)) {
				int j = 2;
				while(true) {
					result = i * j++;
					if(result > 10000) {
						break;
					}
					ans[result] = true;
				}
				
			}
		}
		
		int T = sc.nextInt();
		
		while(T --> 0) {
			
			int n = sc.nextInt();
			int a = n/2;
			int b = n/2;
			
			while(true) {
				if(ans[a] == false && ans[b] == false) {
					sb.append(a+" "+b+"\n");
					break;
				}
				a--;
				b++;
			}
		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}
