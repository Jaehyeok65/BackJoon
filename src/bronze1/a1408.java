package bronze1;


import java.util.*;


public class a1408 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String sec = sc.nextLine();
		
		String ans1[] = first.split(":");
		String ans2[] = sec.split(":");
		String ans3[] = new String[ans1.length];
		
		int temp1[] = new int[ans1.length];
		int temp2[] = new int[ans2.length];
		int temp3[] = new int[ans2.length];
		int temp = 0;
		for(int i = temp1.length - 1; i >= 0; i--) {
			temp1[i] = Integer.parseInt(ans1[i]);
			temp2[i] = Integer.parseInt(ans2[i]);
			if(i == 2) {
				temp = temp2[i] - temp1[i];
				if(temp < 0) {
					temp += 60;
				}
				temp3[i] = temp;
			}
			else if (i == 1) {
			temp = temp2[i] - temp1[i];
			if(temp1[i+1] > temp2[i+1]) {
				temp -= 1;
			}
			if(temp < 0) {
				temp += 60;
			}
			temp3[i] = temp;
			}
			else {
				temp = temp2[i] - temp1[i];
				if(temp1[i+1] > temp2[i+1]) {
					temp -= 1;
				}
				if(temp1[i+1] == temp2[i+1] && temp1[i+2] > temp2[i+2]) {
					temp -= 1;
				}
				if(temp < 0) {
					temp += 24;
				}
				temp3[i] = temp;
			}
		}
		for(int i = 0; i < temp3.length; i++) {
			if(i == temp3.length-1) {
				System.out.print(String.format("%02d", temp3[i]));
			}
			else {
			System.out.print(String.format("%02d", temp3[i])+":");
			}
		}
			
		
		
		// TODO Auto-generated method stub

	}

}
