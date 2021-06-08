package class2;


import java.util.*;


public class a1037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int n[] = new int[T];
		
		for(int i = 0; i < T; i++) {
			n[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n.length; i++) {
			if(max < n[i]) {
				max = n[i];
			}
			if(min > n[i]) {
				min = n[i];
			}
		}
		int result = max * min;
		System.out.print(result);
		
		// TODO Auto-generated method stub

	}

}
