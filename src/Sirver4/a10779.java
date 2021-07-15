package Sirver4;


import java.util.*;


public class a10779 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> stack = new Stack<>();
		
		String s = sc.nextLine();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char item = s.charAt(i);
			if(item == '(') {
				stack.push(item);
			}
			else if(item == ')') {
				stack.pop();
				if(s.charAt(i-1) == '(') {
				count += stack.size();
				}
				else {
					count++;
				}
			}
		}
		
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
