package class2;


import java.util.*;
import java.io.*;


public class a10828 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		while(n --> 0) {
			
			String s = sc.next();
			
			if(s.equals("push")) {
				stack.push(sc.nextInt());
			}
			else if(s.equals("top")) {
				if(stack.empty()) { //스택이 비어있어서 참조할 것이 없는 경우
					sb.append(-1 + "\n");
				}
				else {
					sb.append(stack.peek()+"\n");
				}
			}
			else if(s.equals("size")) {
				sb.append(stack.size()+"\n");
			}
			else if(s.equals("empty")) {
				if(stack.empty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
			}
			else if(s.equals("pop")) {
				if(stack.empty()) { //스택이 비어있어서 출력할 것이 없는 경우
					sb.append(-1+"\n");
				}
				else {
					sb.append(stack.pop()+"\n");
				}
			}			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
