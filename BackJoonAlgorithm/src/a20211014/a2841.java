package a20211014;


import java.util.*;


public class a2841 {
	
	public static Stack<Integer> stack[];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		int count = 0;
		stack = new Stack[7];
		
		for(int i = 1; i <= 6; i++) {
			stack[i] = new Stack<>();
		}
		
		for(int i = 0; i < n; i++) {
			int line = sc.nextInt();
			int plat = sc.nextInt();
			
			if(stack[line].size() == 0) {  //스택에 아이템이 없다면 스택에 푸쉬
				stack[line].push(plat);
				count++;
				continue;
			}
			
			while(stack[line].peek() > plat) {
				stack[line].pop();
				count++;
				if(stack[line].size() == 0) {
					break;
				}
			}
			
			if(stack[line].size() != 0 && stack[line].peek() == plat) {
				continue;
			}
			stack[line].push(plat);
			count++;
		}
		
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
