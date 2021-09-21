package a20210921;


import java.util.*;
import java.io.*;


public class a2075 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //시간과 메모리를 줄이기 위한 buffer선언
		PriorityQueue<Integer> prque = new PriorityQueue<>(Collections.reverseOrder()); //우선순위큐 (높은 순) 선언
		int N = Integer.parseInt(br.readLine());  //2차원 배열의 크기 N
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());  //한 줄을 입력바다 StringTokenizer에 저장
			
			while(st.hasMoreTokens()) {    //2차원 배열의 한줄을 우선순위 큐에 삽입 (삽입되자마자 높은 순으로 정렬됨)
				int n = Integer.parseInt(st.nextToken());
				prque.add(n);
			}
		}
		int result = 0;
		for(int i = 0; i < N; i++) {  //하나씩 뽑으면서 N번째 큰수를 result에 저장함.
			result = prque.poll();
		}
		System.out.print(result);
		
		
		// TODO Auto-generated method stub

	}

}
