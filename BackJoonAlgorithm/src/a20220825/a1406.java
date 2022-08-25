package a20220825;

import java.util.*;
import java.io.*;





public class a1406 {
	
	
	public static class Stacks {
		
		private String cursor = "*";
		LinkedList<String> stack = new LinkedList<>();
		
		
		public Stacks(String first) { //입력받은 문자열을 차례대로 리스트에 넣고 맨 마지막에 커서를 넣음 == 커서는 맨 마지막에 위치
			for(int i = 0; i < first.length(); i++) {
				stack.add(first.substring(i,i+1));
			}
			stack.add(cursor);
		}
		
		public void inputL() { //L이 입력되었을 경우 커서를 왼쪽으로 이동시킴
			if(stack.indexOf(cursor) == 0) { //맨 왼쪽에 있을 경우
				return; //무시
			}
			else { //커서를 왼쪽으로 이동시킴
				int index = stack.indexOf(cursor);
				stack.add(index - 1, cursor);
				stack.remove(index + 1);
			}
		}
		
		public void inputD() { //D가 입력되었을 경우 커서를 오른쪽으로 이동시킴
			if(stack.indexOf(cursor) == stack.size() - 1) { //커서가 맨 마지막에 있을 경우
				return; //무시
			}
			else {
				int index = stack.indexOf(cursor);
				//System.out.println(index);
				stack.add(index + 2, cursor);
				stack.remove(index);
			}
		}
		
		public void inputB() { //B가 입력되었을 경우 커서 왼쪽에 있는 문자를 삭제
			if(stack.indexOf(cursor) == 0) { //커서가 맨 왼쪽에 있을 경우
				return; //무시
			}
			else {
				int index = stack.indexOf(cursor) - 1 ;
				stack.remove(index);
			}
		}
		
		public void inputP(String item) { //커서 왼쪽에 추가함
			int index = stack.indexOf(cursor);
			if(index == 0) {
				stack.addFirst(item); //커서가 맨 처음에 있을 경우 addFirst로 삽입
			}
			else {
				stack.add(index, item);
			}
		}
		
		public void print() {
			
			stack.remove(cursor);
			for(int i = 0; i < stack.size(); i++) {
				System.out.print(stack.get(i));
			}
		}
		
		
	}
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String first = br.readLine();
		
		Stacks sta = new Stacks(first);
		
		
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.equals("P")) {
				sta.inputP(st.nextToken());
			}
			else if(s.equals("L")) {
				sta.inputL();
			}
			else if(s.equals("D")) {
				sta.inputD();
			}
			else if(s.equals("B")) {
				sta.inputB();
			}
		}
		
		sta.print();
		
		// TODO Auto-generated method stub

	}

}
