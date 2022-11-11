package a20221111;

import java.util.*;



public class a5565 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int total = sc.nextInt();
		
		for(int i = 0; i < 9; i++) {
			int price = sc.nextInt();
			total -= price;
		}
		
		System.out.print(total);
		// TODO Auto-generated method stub

	}

}
