import java.util.*;


public class a2959 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int[4];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.print(arr[0]*arr[2]);
		
		// TODO Auto-generated method stub

	}

}
