package Sirver4;



import java.util.*;


public class a3986 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int result = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			char c = s.charAt(0);
			stack.push(c);
			for(int j = 1; j < s.length(); j++) {
				char item = s.charAt(j);
				if(!stack.isEmpty()) {
				if(stack.peek() == item) {
					stack.pop();
				}
				else {
					stack.push(item);
				}
				}
				else {
					stack.push(item);
				}
			}
			if(stack.isEmpty()) {
				result++;
			}
			stack.clear();
		}
		System.out.print(result);
		
		
		// TODO Auto-generated method stub

	}

}
