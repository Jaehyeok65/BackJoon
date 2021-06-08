import java.util.*;


public class a2490 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int u[] = new int[4];
		int count = 0;
		for(int j = 0; j < 3; j++) {
		for(int i = 0; i < u.length; i++) {
			u[i] = sc.nextInt();
			if(u[i] == 1) count++;
		}
		switch(count) {
		case 0:
			System.out.println("D");
			break;
		case 1:
			System.out.println("C");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("A");
			break;
		case 4:
			System.out.println("E");
			break;
		} 
		count = 0;
		}
		}
		
		// TODO Auto-generated method stub

	}


