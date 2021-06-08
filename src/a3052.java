import java.util.*;


public class a3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int count = 0;
		boolean counts[] = new boolean[42];
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr[i] = a % 42;
		}
		for(int i = 0; i < arr.length; i++) {
			counts[arr[i]] = true;
		}
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] == true) {
				count++;
			}
		}
		
		
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
