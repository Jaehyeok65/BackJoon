package a20210925;


import java.util.*;


public class a5052 {
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(T --> 0) {
			
			int n = sc.nextInt();
			String arr[] = new String[n];
			boolean flag = true;
			for(int i = 0; i < n; i++) {
				arr[i] = sc.next();
			}
			
			Arrays.sort(arr);
			
			for(int i = 0; i < n-1; i++) {
				if(arr[i+1].startsWith(arr[i])) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				sb.append("YES" + "\n");
			}
			else {
				sb.append("NO" +  "\n");
			}
			
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
