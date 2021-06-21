package class2;


import java.io.*;
import java.util.*;

public class a4949 {
	
	static Stack<Character> stack1 = new Stack<>();
	static Stack<Character> stack2 = new Stack<>();
	
	static boolean pan(char c) {
		for(int i = 'a'; i < 'z'; i++) {
			if(i == c) {
				return true;
			}
		}
		for(int i = 'A'; i < 'Z'; i++) {
			if(i == c) {
				return true;
			}
		}
		return false; //문자가 아니면 false를 리턴
	}
	
	static boolean solution1(String ans) {
		
		for(int i = 0; i < ans.length(); i++) {
			
			if(ans.charAt(i) == '(') { //소괄호를 저장하는 스택
				stack1.add(ans.charAt(i));
				if(i>1 && pan(ans.charAt(i-1))) { //괄호가 나오기 전에 문자가 나오면 아닐 때 문자열은 균형잡혀있지 않다고봄
					return false;
				}
			}
			if(ans.charAt(i) == ')') {
				if(stack1.isEmpty()) { //소괄호 짝이 없으면
					return false;
				}
				else {
					stack1.pop();
				}
				
			}
		}
		if(stack1.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
   static boolean solution2(String ans) {
		
		for(int i = 0; i < ans.length(); i++) {
			
			if(ans.charAt(i) == '[') { //소괄호를 저장하는 스택
				stack2.add(ans.charAt(i));
				if(i > 1 && pan(ans.charAt(i-1))) {
					return false;
				}
			}
			if(ans.charAt(i) == ']') {
				if(stack2.isEmpty()) { //소괄호 짝이 없으면
					return false;
				}
				else {
					stack2.pop();
				}
				
			}
		}
		if(stack2.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
   



	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String ans = br.readLine();
			if(ans.equals(".")) {
				break;
			}
			if(solution1(ans) && solution2(ans)) { //둘 다 참이면
				sb.append("yes"+"\n");
			}
			else {
				sb.append("no"+"\n");
			}
			stack1.clear();
			stack2.clear();
		
		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}