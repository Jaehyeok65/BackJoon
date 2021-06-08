import java.util.*;


public class a2920 {
	
	public static boolean equal(int[] arr1, int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6,7,8};
		int arr2[] = new int[8];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int arr3[] = {8,7,6,5,4,3,2,1};
		
		if(equal(arr,arr2)) {
			System.out.println("ascending");
		}
		else if(equal(arr2,arr3)) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
