package bronze1;


import java.util.*;

public class a1357 {
	

	public static int reverse(int n) {
		Queue<Integer> que = new LinkedList<Integer>();
		String results = "";
		
		while(n > 0) {
			que.offer(n % 10);
			n /= 10;
		}
		while(!que.isEmpty()) {
			String s1 = String.valueOf(que.poll());
			results += s1;
		}
		int result = Integer.parseInt(results);
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int ans = 0;
		ans = reverse(reverse(n1) + reverse(n2));
		System.out.print(ans);
		
		
		// TODO Auto-generated method stub

	}

}
