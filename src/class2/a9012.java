package class2;


import java.util.*;


public class a9012 {
	
	public static String result(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}
			else if(stack.empty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		
		if(stack.empty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	
	
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println(result(sc.next()));
			
		}
	
		
		// TODO Auto-generated method stub

	}

}
