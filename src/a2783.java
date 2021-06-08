

import java.util.*;

public class a2783 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double gram = 1000;
		double sevenx = sc.nextDouble();
		double seveny = sc.nextDouble(); // y그램당 x원
		double minconst = sevenx*(gram/seveny);
		double miny = seveny;
		System.out.println("");
		int n = sc.nextInt();
		double gsx[] = new double[n];
		double gsy[] = new double[n];
		for(int i = 0; i < n; i++) {
			gsx[i] = sc.nextInt();
			gsy[i] = sc.nextInt();
			double gsconst = gsx[i]*(gram/gsy[i]);
			if(minconst > gsconst) {
				minconst = gsconst;
				miny = gsy[i];
			}
		}
		System.out.println(minconst);
		
		
		
		// TODO Auto-generated method stub

	}

}
