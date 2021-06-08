import java.util.*;


public class a3034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int eorkr =  (int)Math.sqrt(Math.pow(w, 2)+ Math.pow(h, 2));
		int sung[] = new int[n];
		for(int i = 0; i < n; i++) {
			sung[i] = sc.nextInt();
			if(sung[i] <= eorkr) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
		// TODO Auto-generated method stub

	}

}
