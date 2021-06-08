import java.util.*;

public class a4880 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == 0 && b == 0 && c == 0) {
			break;
		}
		if(c - b == b - a) {
			System.out.print("AP "+(c + (c-b)));
			System.out.println("");
		}
		if((double)c/b == (double)b/a) {
			System.out.print("GP "+c*(c/b));
			System.out.println("");
		}
		}
		// TODO Auto-generated method stub

	}

}
