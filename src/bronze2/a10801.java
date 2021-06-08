package bronze2;


import java.util.*;


public class a10801 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int awin = 0;
		int bwin = 0;
		int draw = 0;
		int carda[] = new int[10];
		int cardb[] = new int[10];
		for(int i = 0; i < 10; i++) {
			carda[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			cardb[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(carda[i] > cardb[i]) {
				awin++;
			}
			else if(carda[i] < cardb[i]) {
				bwin++;
			}
			else {
				draw++;
			}
		}
		
		if(awin > bwin) {
			System.out.print("A");
		}
		else if(bwin > awin) {
			System.out.print("B");
		}
		else {
			System.out.print("D");
		}
		
		// TODO Auto-generated method stub

	}

}
