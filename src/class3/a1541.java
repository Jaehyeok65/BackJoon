package class3;


import java.util.*;


public class a1541 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String arr[] = s.split("-");
		
		int sum = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			int temp = 0;
			String ans[] = arr[i].split("\\+");
			
			for(int j = 0; j < ans.length; j++) {
				temp += Integer.parseInt(ans[j]);
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}
			else {
				sum -= temp;
			}
			
			
		}
		System.out.print(sum);
		
		
		
		// TODO Auto-generated method stub

	}

}
