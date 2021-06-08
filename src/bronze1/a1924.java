package bronze1;


import java.util.*;

public class a1924 {

	public static void main(String[] args) {
		
		String day[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int day1 = 0;
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // x 월
		int y = sc.nextInt(); // y 일
		for(int i = 0; i < x-1; i++) {
			day1 += month[i];
		}
		for(int i = 1; i <= y; i++) {
			day1++;
		}
		System.out.print(day[day1 % 7]);
		
		// TODO Auto-generated method stub

	}

}