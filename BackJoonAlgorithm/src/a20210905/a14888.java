package a20210905;


import java.util.*;



public class a14888 {
	
	
	static int arr[];
	static int oper[];
	static int Max = Integer.MIN_VALUE;
	static int Min = Integer.MAX_VALUE;
	static int n;
	
	
	public static void back(int num, int depth) {
		
		if(depth ==  n) {
			Max = Math.max(Max, num);
			Min = Math.min(Min, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {  //연산자 배열에 들어있는 반복문을 재귀를 통해 모든 경우의 수를 구한다.
			if(oper[i] > 0) {  //0은 연산자가 없다는 것을 의미하므로 
				
				oper[i]--;  //연산자를 사용
				
				if(i == 0) {   // i가 0 이면 덧셈
					back(num + arr[depth], depth + 1);
				}
				else if(i == 1) {  //i가 1이면 뺄셈
					back(num - arr[depth], depth + 1);
				}
				else if(i == 2) {   //i가 2이면 곱셈 수행
					back(num * arr[depth], depth + 1);
				}
				else if(i == 3) { // i가 3이면 나눗셈 수행
					back(num / arr[depth], depth + 1);
				}
				
				oper[i]++;  //호출이 끝나면 다시 재귀를 수행해야하므로 연산자를 복구시킴
			}
			
			
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		oper = new int[4];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			oper[i] = sc.nextInt();
		}
		
		back(arr[0],1);
		
		System.out.println(Max);
		System.out.println(Min);
		
		
		
		// TODO Auto-generated method stub

	}

}
