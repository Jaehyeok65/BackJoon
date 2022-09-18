package a20220918;


import java.util.*;
import java.io.*;



public class a1092 {
	
	static int N; //크레인의 개수
	static int M; //박스의 개수
	static ArrayList<Integer> crain;
	static ArrayList<Integer> box;
	
	
	public static int solve() {
		
		
		
		Collections.sort(crain, (o1,o2) -> o2 - o1); // 박스랑 크레인을 내림차순 정렬
		Collections.sort(box, (o1,o2) -> o2 - o1);   // 박스랑 크레인을 내림차순 정렬
		
		if(box.get(0) > crain.get(0)) {
			return -1;
		}
		
		int count = 0;
		
		while(!box.isEmpty()) {
			int j = 0;
			for(int i = 0; i < N; ) {
				if(j == box.size()) {
					break;
				}
				else if(crain.get(i) >= box.get(j)) {
					box.remove(j);
					i++;
				}
				else {
					j++;
				}
			}
			count++;
		}
		
		return count;
		
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		crain = new ArrayList<>();
		box = new ArrayList<>();
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			crain.add(Integer.parseInt(st.nextToken()));
		}
		
		M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.print(solve());
		
		// TODO Auto-generated method stub

	}

}
