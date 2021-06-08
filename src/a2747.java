
import java.util.*;

public class a2747 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for(int i = 2; i < f.length; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		System.out.println(f[n]);
		
		// TODO Auto-generated method stub

	}

}
