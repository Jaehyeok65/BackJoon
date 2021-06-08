package class2;


import java.util.*;


public class a7568 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int weight[] = new int[n];
		int height[] = new int[n];
		int k[] = new int[n];
		for(int i = 0; i < k.length; i++) { //처음 등수는 모두 1로 초기화
			k[i] = 1;
		}
		
		for(int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(weight[i] < weight[j] && height[i] < height[j]) { //자신보다 키와 덩치가 모두 큰 사람이 있다면 등수를 더함
					k[i]++;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(k[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
