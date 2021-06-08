package class2;


import java.util.*;


public class a10866 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> deq = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		while(n --> 0) {
			
			String s = sc.next();
			if(s.equals("push_front")) {
				deq.addFirst(sc.nextInt());
			}
			else if(s.equals("push_back")) {
				deq.addLast(sc.nextInt());
			}
			else if(s.equals("pop_front")) {
				if(deq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(deq.pollFirst()+"\n");
				}
			}
			else if(s.equals("pop_back")) {
				if(deq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(deq.pollLast()+"\n");
				}
			}
			else if(s.equals("size")) {
				sb.append(deq.size()+"\n");
			}
			else if(s.equals("empty")) {
				if(deq.isEmpty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
			}
			else if(s.equals("front")) {
				if(deq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(deq.peekFirst()+"\n");
				}
			}
			else if(s.equals("back")) {
				if(deq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(deq.peekLast()+"\n");
				}
			}
					
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
