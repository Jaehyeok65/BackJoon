package class2;


import java.util.*;


public class a1292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[1001];
		int k = 0;
		int count[] = new int[50];
		int sum = 0;
		for(int j = 0; j < count.length; j++) {
			count[j] = j + 1;
		}
		for(int j = 0; j < count.length; j++) {
			int i = 1;
			while(i++ <= count[j]) {
				if(k > 1000) {
					break;
				}
				arr[k++] = count[j];
			}
			if(k > 1000) {
				break;
			}
		}
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int j = n-1; j <= m-1; j++) {
			sum += arr[j];
		}
		System.out.print(sum);
		
		// TODO Auto-generated method stub

	}

}
