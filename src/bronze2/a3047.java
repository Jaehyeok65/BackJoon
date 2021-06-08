package bronze2;


import java.util.*;


public class a3047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		String s = sc.next();
		char abc[] = new char[3];
		for(int i = 0; i < s.length(); i++) {
			abc[i] = s.charAt(i); //A < B < C
			System.out.print(arr[abc[i] - 65]+" ");
		}
		// TODO Auto-generated method stub

	}

}
