package class2;


import java.util.*;


public class a1874b {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int Test = sc.nextInt();
		int now = 0;
		for(int i = 0; i < Test; i++) {
			int n = sc.nextInt();
			
			if(now < n) { //현재수가 다음에 입력받을 수보다 작으면 경우 push를 수행한다
				for(int j = now+1; j <= n; j++) {
					stack.push(j);
					sb.append("+" + "\n");
				}
				now = stack.peek();
			}
			
			else if(stack.peek() != n) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-" + "\n");
			
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
