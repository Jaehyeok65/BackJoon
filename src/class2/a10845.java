package class2;


import java.util.*;
import java.io.*;

public class a10845 {

	public static void main(String[] args)  {
		
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = 0;
		Queue<Integer> que = new LinkedList<>();
		
		while (n --> 0) {
			
			String s = sc.next();
			
			if(s.equals("push")) {
				result = sc.nextInt();
				que.offer(result);
			}
			else if(s.equals("pop")) {
				if(que.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(que.poll()+"\n");
				}
			}
			else if(s.equals("size")) {
				sb.append(que.size()+"\n");
			}
			else if(s.equals("empty")) {
				if(que.isEmpty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
			}
			else if(s.equals("front")) {
				if(que.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(que.peek()+"\n");
				}
			}
			else if(s.equals("back")) {
				if(que.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(result+"\n");
				}
			}
		}
		
		System.out.print(sb.toString());;
		// TODO Auto-generated method stub

	}

}
