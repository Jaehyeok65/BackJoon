package class2;


import java.util.*;


public class a1427 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while(n > 0) {
			list.add(n%10);
			n = n / 10;
		}
		int arr[] = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	
		// TODO Auto-generated method stub

	}

}
