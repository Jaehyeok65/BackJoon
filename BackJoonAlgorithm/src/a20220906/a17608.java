package a20220906;


import java.io.*;
import java.util.*;


public class a17608 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 1; //정답 초기에 기준 높이가 보이므로
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		
		
		
		for(int i = 0; i < num; i++) {
			int h = Integer.parseInt(br.readLine());
			stack.push(h);
		}
		
		int k = stack.pop(); //기준 높이
		
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			if(tmp > k) {
				result++;
				k = tmp; //가려서 안보이므로 기준 높이를 변경해줌
			}
		}
		System.out.print(result);
		
		
		// TODO Auto-generated method stub

	}

}
