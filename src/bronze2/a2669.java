package bronze2;


import java.util.*;


public class a2669 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr0[] = new int[4];
		int area[] = new int[4];
		for(int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			area[i] = (x2 - x1) * (y2 - y1); //면적을 저장. 
			
		}
		// TODO Auto-generated method stub

	}

}
