package a20210925;


import java.util.*;


public class a17298 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
			
		}
		
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
