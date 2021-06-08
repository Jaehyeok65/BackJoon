import java.util.*;


public class a5063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(b > a + c) {
				System.out.println("advertise");
			}
			else if(b == a + c) {
				System.out.println("does not matter");
			}
			else {
				System.out.println("do not advertise");
			}
		}
		// TODO Auto-generated method stub

	}

}
