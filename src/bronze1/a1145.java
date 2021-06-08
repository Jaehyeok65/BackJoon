package bronze1;


import java.util.*;


public class a1145 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ans[] = new int[5];
		for(int i = 0; i < 5; i++) {
			ans[i] = sc.nextInt();
		}
		Arrays.sort(ans);
		
		int min = ans[0];
		int cnt = 0;
		
		while(true) {
			for(int i = 0; i < ans.length; i++) {
				if(min % ans[i] == 0) {
					cnt++;
				}
			}
				if(cnt >= 3) {
					break;
				}
				else {
					cnt = 0;
					min++;
				}
			
		}
		System.out.print(min);

	}

}
