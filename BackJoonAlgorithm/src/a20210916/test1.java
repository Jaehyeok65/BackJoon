package a20210916;

import java.util.*;


public class test1 {
	
	public static int minnum(Deque<Integer> que, int n) {
		
		int min = n;
		
		for(int q : que) {
			min = Math.min(min, q);
		}
		
		return min;
	}
	
     public static int maxnum(Deque<Integer> que, int n) {
		
		int max = n;
		
		for(int q : que) {
			max = Math.max(max, q);
		}
		
		return max;
	}
	
	

	public static void main(String[] args) { //1 x가 입력되면 현재까지 올렸던 블록의 최대, 최소값을 출력
		                                     //2가 입력되면 맨 마지막에 올렸던 블록을 제거, (출력x)
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int test = sc.nextInt();
		int max = 0;
		int min = 0;
		boolean check = false; //블록 삽입인지, 제거인지를 결정할  boolean 변수
		int x = 0;
		while(test --> 0) {
			Deque<Integer> que = new LinkedList<>();  //큐는 양방향이 안되기 때문에 데큐로 자료구조 작성
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int first = sc.nextInt();
				if(first == 1) { //first가 1이라면 쌓을 블록 x를 입력받음
					x = sc.nextInt();
					check = true;  //check를 true로 바꿔 블록을 쌓을 것이라고 알려줌
				}
				if(check) {   //check가 true라면 블록 삽입이므로 맨 위에 블록을 쌓음
					que.addLast(x);  //x를 큐에 넣음
					min = minnum(que,x); //큐에 들어있는 인덱스와 비교하여 min값을 리턴하여 min변수에 대입
					max = maxnum(que,x); //큐에 들어있는 인덱스와 비교하여 max값을 리턴하여 max변수에 대입
					sb.append("최대: " + max + " 최소 : " + min + "\n");
				}
				else {       //check가 false라면 블록 제거이므로 맨 위 블록을 제거함;
					if(!que.isEmpty()) { //큐가 비어있지 않다면 맨 위블록을 제거함 (큐가 비어있다면 비울 필요가없음 == 에러발생)
					que.removeLast();
					}
				}
				check = false; //반복이 끝난 시점에 check를 false로 초기화해줌
			}
			
		}
		
		System.out.print(sb.toString());
		
		
		
		// TODO Auto-generated method stub

	}

}
