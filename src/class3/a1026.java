package class3;


import java.util.*;


public class a1026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		Integer b[] = new Integer[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b,Collections.reverseOrder());
		for(int i = 0; i < b.length; i++) {
			int ans = a[i] * b[i];
			sum += ans;
		}
		System.out.print(sum);
		

		
		
		// TODO Auto-generated method stub

	}

}
