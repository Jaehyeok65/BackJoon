import java.util.*;


public class a5073 {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String result = "";
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			if(a > b && a > c) {
				if(a >= b + c) {
				result = "Invalid";
			}
			}
			else if(b > a && b > c) {
				if(b >= a + c) {
					result = "Invalid";
				}
			}
			else{
				if(c >= a +b) {
					result = "Invalid";
				}
			}
			if(result == ""  && a == b && b == c) {
				result = "Equilateral";
			}
			else if(result == "" && a == b || b == c || a == c) {
				result = "Isosceles";
			}
			else if(result == "" && a != b && b != c){
				result = "Scalene";
			}
			
			System.out.println(result);
			
			
		}
		// TODO Auto-generated method stub

	}

}
