package 복습;


import java.util.*;


public class a1978소수 { //에라토스테네스의 체  == 범위의 제곱근까지 소수인 수만 제외하고 
	static int N;
	static boolean arr[];
	static int count;
	static void sosu() {
		arr = new boolean[1001];
		arr[0] = true;
		arr[1] = true;
		int sqrt = (int)Math.sqrt(arr.length);
		
		for(int i = 2; i <= sqrt; i++) {
			
			
			for(int j = i*i; j < arr.length; j = j + i) {
				arr[j] = true;
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		N = sc.nextInt();
		sosu();
		for(int i = 0; i < N; i++) {
			
			int k = sc.nextInt(); //수를 n번 반복
			if(!arr[k]) {
				count++;
			}
		}
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
