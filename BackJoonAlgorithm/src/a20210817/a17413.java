package a20210817;

import java.util.*;



public class a17413 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		boolean flag = false;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '<') {
				flag = true;
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				System.out.print(s.charAt(i));
			}
			else if(s.charAt(i) == '>') {
				flag = false;
				System.out.print(s.charAt(i));
			}
			else if(flag) {
				System.out.print(s.charAt(i));
			}
			else if(!flag) {
				if(s.charAt(i) == ' ') {
					while(!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					System.out.print(s.charAt(i));
				}
				else {
					stack.push(s.charAt(i));
				}
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		// TODO Auto-generated method stub

	}

}
