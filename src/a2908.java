import java.util.*;


public class a2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String ar = String.valueOf(a);
		String br = String.valueOf(b);
		
		StringBuffer ars = new StringBuffer(ar);
		StringBuffer brs = new StringBuffer(br);
		
		String aa = ars.reverse().toString();
		String bb = brs.reverse().toString();
		
		int aaa = Integer.parseInt(aa);
		int bbb = Integer.parseInt(bb);
		
		if(aaa > bbb) {
			System.out.println(aaa);
		}
		else {
			System.out.println(bbb);
		}
		// TODO Auto-generated method stub

	}

}
