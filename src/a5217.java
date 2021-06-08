import java.util.*;


public class a5217 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int t = sc.nextInt();
		int sw = 0;
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.print("Pairs for "+n+": ");
			for(int j = 1; j <= 12; j++) {
				for(int k = 1; k <= 12; k++) {
					if(j + k == n && j < k && j != k && sw == 0)
					{
						System.out.print(j+" "+k);
						sw = 1;
					}
					else if(j + k == n && j < k && j != k && sw == 1) {
						System.out.print(", "+j+" "+k);
						sw = 1;
					}
				}
			}
			sw = 0;
			System.out.println("");
			}
		}
		// TODO Auto-generated method stub

	}


