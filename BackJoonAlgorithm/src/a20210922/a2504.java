package a20210922;


import java.util.*;


public class a2504 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		int count = 1;
		int result = 0;
		boolean check = true;
		
		for(int i = 0; i < s.length(); i++) {
			char item = s.charAt(i);
			
			if(item == '(') {   //좌괄호를 만난 경우 2를 곱해주고 스택에 넣는다
				count *= 2;
				stack.push(item);
			}
			else if(item == '[') {  //우괄호를 만난 경우 2를 곱해주고 스택에 넣는다
				count *= 3;
				stack.push(item);
			}
			else {              //닫는 괄호를 만난 경우
				if(item == ')') {   //닫는 괄호가 소괄호일 경우
					
					if(stack.peek() != '(' || stack.isEmpty()) {
						check = false;
						break;
					}
					if(s.charAt(i-1) == '(') {
						result += count;
					}
					stack.pop();
					count /= 2;
				}
				
				else if(item == ']') {
					
					if(stack.peek() != '[' || stack.isEmpty()) {
						check = false;
						break;
					}
					if(s.charAt(i-1) == '[') {
						result += count;
					}
					stack.pop();
					count /= 3;
					}
				else {
					check = false;
					break;
				}
			}
		}
		
		if(!check || !stack.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(result);
		}
		
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
