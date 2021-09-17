package a20210917;


import java.util.*;
	
	
public class a15903 {
	static int N;
	static int M;
	static long card[];
	static long result;
	
	public static void greedy(int m) { //그리디 알고리즘
		
		if(m == M) {    //시행 횟수가 M과 같아지면 카드의 번호를 모두 더하고 리턴한다.
			result = print();
			return;
		}
		
		Arrays.sort(card);    //카드를 번호대로 정렬
		long tmp = card[0] + card[1];  //카드의 가장 작은 번호 두개를 뽑아 더하고
		card[0] = card[1] = tmp;       //그 값을 가장 작은 번호에 대입 (결과가 가장 작아지게 됨)
		greedy(m + 1);              //M번 재귀 수행
	}
	
	
	public static long print() {   //카드의 모든 값을 더하는 메소드
		long ans = 0;
		for(long i : card) {
			ans += i;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();  //카드의 개수
		M = sc.nextInt();  //카드 합체의 횟수
		card = new long[N];
		
		for(int i = 0; i < N; i++) {  //카드를 입력받음
			card[i] = sc.nextLong();
		}
		
		greedy(0);  //알고리즘 수행
		
		System.out.print(result);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
