import java.text.DecimalFormat;
import java.util.*;


public class a4766 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##");
		double n = sc.nextDouble();
		double before = n;
		while(true) {
			double a = sc.nextDouble();
			if(a == 999) {
				break;
			}
			System.out.printf("%.2f\n",a - before);
			before = a;
		}
		
		// TODO Auto-generated method stub

	}

}
