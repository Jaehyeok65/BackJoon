package a20220826;


import java.util.*;
import java.io.*;


public class a18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s) {
			case "push" : {
				int next = Integer.parseInt(st.nextToken());
				que.add(next);
				stack.push(next);
				break;
			}
			case "pop" : {
				if(que.isEmpty()) {
					sb.append(-1 + "\n");
				}
				else {
					sb.append(que.poll() + "\n");
				}
				break;
			}
			case "size" : {
				sb.append(que.size() + "\n");
				break;
			}
			case "empty" : {
				if(que.isEmpty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
				break;
			}
			case "front" : {
				if(que.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(que.peek()+"\n");
				}
				break;
			}
			case "back" : {
				if(que.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(stack.peek()+"\n");
				}
				break;
			}
			}
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
