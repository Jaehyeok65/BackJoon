package a20211016;


import java.io.*;
import java.util.*;

public class a11000 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
		});
		
		PriorityQueue<Integer> prque = new PriorityQueue<>();
		
		prque.add(arr[0][1]);   //처음 강의의 끝나는 시간을 우선순위큐에 넣음
		
		for(int i = 1; i < n; i++) {
			if(arr[i][0] >= prque.peek()) {   //강의 시작시간이 현재 들어있는 끝나는 시간보다 크다면 (강의실을 재사용가능)
				prque.poll();                 //즉 강의실 공간을 하나 빼준다 == poll
			}
			
			prque.add(arr[i][1]);             //강의실 공간을 하나 추가
		}
		
		System.out.print(prque.size());
		
		
		// TODO Auto-generated method stub

	}

}
