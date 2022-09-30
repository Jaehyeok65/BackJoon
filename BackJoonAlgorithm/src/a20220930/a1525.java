package a20220930;

import java.util.*;
import java.io.*;



public class a1525 {
	
	static String target = "123456780";
	static String num = "";
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	static HashMap<String,Integer> hash = new HashMap<>();
	
	public static int bfs() {
		Queue<String> que = new LinkedList<>(); //배열을 담을 큐를 선언
		que.add(num); //큐에다가 현재 배열을 담음
		hash.put(num,0);
		
		while(!que.isEmpty()) {
			String s = que.poll(); //배열을 꺼내줌
			int move = hash.get(s);
			int cur = s.indexOf("0"); //0이 들어있는 현재 위치를 반환
			int curx = cur%3;
			int cury = cur/3;
			
			if(s.equals(target)) {
				return move;
			}
			
			for(int i = 0; i < 4; i++) {
				int nextX = curx + dx[i];
				int nextY = cury + dy[i];
				
				if(nextX < 0 || nextX > 2 || nextY < 0 || nextY > 2) continue; //map의 범위를 벗어나면 continue
				
				int next = nextY * 3 + nextX;
				char c = s.charAt(next);
				
				String nexts = s.replace(c, 'c');
				nexts = nexts.replace('0', c);
				nexts = nexts.replace('c', '0');
				
				if(!hash.containsKey(nexts)) {
					que.add(nexts);
					hash.put(nexts, move+1);
				}
				
				
			}
			
			
			
		}
		
		return -1;
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				num += st.nextToken();
			}
		} //입력 완료
		
		int result = bfs();
		
		System.out.print(result);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
