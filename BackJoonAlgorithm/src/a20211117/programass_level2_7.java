package a20211117;


import java.util.*;


public class programass_level2_7 {
	
	
	public static int solution(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}
			else {
				char prev = stack.peek();
				char now = s.charAt(i);
				if(now == prev) {
					stack.pop();
				}
				else {
					stack.push(now);
				}
			}
		}
		
		if(stack.size() == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		
		String s = "baabaa";
		System.out.print(solution(s));
		// TODO Auto-generated method stub

	}

}
