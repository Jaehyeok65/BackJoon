package a20220907;



import java.util.*;
import java.io.*;


public class a1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<member> list = new ArrayList<>();
			int result = 0;
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int first = Integer.parseInt(st.nextToken());
				int second = Integer.parseInt(st.nextToken());
				list.add(new member(first,second));
			}
			
			
			list.sort((o1, o2) -> o1.getFirst() - o2.getFirst()); //서류성적 오름차순으로 정렬
			int compat = list.remove(0).getSecond(); //서류성적 1등은 무조건 통과
			result += 1;
			for(member k : list) {
				if(k.getSecond() < compat) {
					result += 1;
					compat = k.getSecond();
				}
			}
			sb.append(result+"\n");
		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}


class member {
	int first;
	int second;
	
	public void setFirst(int first) {
		this.first = first;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int getFirst() {
		return first;
	}
	
	public int getSecond() {
		return second;
	}
	
	public member(int first, int second) {
		this.first = first;
		this.second = second;
	}

}
