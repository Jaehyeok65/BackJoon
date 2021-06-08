import java.util.*;


public class a2754 {

	public static void main(String[] args) {
		
		String result1[] = {"A+", "A0", "A-", "B+", "B0", "B-","C+","C0","C-","D+","D0","D-","F"};
		double result2[] = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0};
		
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		for(int i = 0; i < result1.length; i++) {
			if(result.equals(result1[i])) {
				System.out.println(result2[i]);
			} 
		}
				// TODO Auto-generated method stu

	}

}
