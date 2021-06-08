import java.util.*;


public class a2720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int don[] = {25,10,5,1};
		int gmoney[] = new int[4];
		int count = 0;
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			for(int j = 0; j < gmoney.length; j++) {
				gmoney[j] = n / don[j];
				n = n % don[j];
			}
			for(int j = 0; j < gmoney.length; j++) {
				System.out.print(gmoney[j]+" ");
			}
			System.out.println("");
		}
		// TODO Auto-generated method stub

	}

}
