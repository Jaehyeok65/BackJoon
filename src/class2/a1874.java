package class2;


import java.util.*;


public class a1874 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int now = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(now < arr[i]) { //현재까지 push된 수보다 다음 수가 더 크다면 push해야함.
			for(int j = now; j < arr[i]; j++) {
				sb.append("+" + "\n");
			}
			sb.append("-" + "\n");
			}
			else { //현재까지 push된 수보다 다음수가 더 작다면 푸쉬할 필요없이 pop을 수행.
				for(int j = 0; i < now - arr[i]; j++) {
					sb.append("-" + "\n");
				}
			}
			now = Math.max(now, arr[i]);
		}
			
			
		// TODO Auto-generated method stub

	}

}
