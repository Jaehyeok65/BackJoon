package a20221009;

import java.util.*;
import java.io.*;


public class a1038 {
	static int N;
	static ArrayList<Long> list = new ArrayList<>();
	
	
	public static void solve(long num, int index) { // 0 ~ 9까지 수행해야함
		if(index > 10) {
			return;
		}
		
		list.add(num);
		for(int i = 0; i < 10; i++) { //i는 가장 마지막에 올 수
			if(num % 10 > i) { //num % 10은 가장 마지막 수이므로 num % 10이 i보다 크다면 감소하는 수 충족
				solve(num * 10 + i, index + 1);
			}
		}
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		if(N < 10) {
			System.out.print(N);
		}
		else {
			for(long i = 0; i < 10; i++) {
				solve(i,1); //자리수가 1이므로
			}
			
			Collections.sort(list);
			
			if(list.size() <= N) {
				System.out.print(-1);
				return;
			}
			System.out.print(list.get(N));
		}
		
		// TODO Auto-generated method stub

	}

}
