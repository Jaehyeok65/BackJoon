import java.util.*;


public class a2985 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//b와 c 사이에 등호가 있는 경우
		if(a + b == c) {
			System.out.println(a+"+"+b+"="+c);
		}
		else if(a*b==c) {
			System.out.println(a+"*"+b+"="+c);
		}
		else if(a/b==c) {
			System.out.println(a+"/"+b+"="+c);
		}
		else if(a-b==c) {
			System.out.println(a+"-"+b+"="+c);
		}
		else if(b+c == a) {
			System.out.println(a+"="+b+"+"+c);
		}
		else if(b-c == a) {
			System.out.println(a+"="+b+"-"+c);
		}
		else if(b/c==a) {
			System.out.println(a+"="+b+"/"+c);
		}
		else if(b*c==a) {
			System.out.println(a+"="+b+"*"+c);
		}
		// TODO Auto-generated method stub

	}

}
