package bronze2;


import java.util.*;


public class a5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = new int[31];
		boolean number1[] = new boolean[31];
		for(int i = 1; i < number.length; i++) {
			number[i] = i;
			number1[i] = false;
		}
		for(int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			for(int j = 1; j < number.length; j++) {
				if(n == number[j]) {
					number1[j] = true;
				}
			}
		}
		for(int i = 1; i < number.length; i++) {
			if(!number1[i]) {
				System.out.println(number[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
