package bronze2;


import java.util.*;


public class a2592 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count[] = new int[1001];
		int max = 0;
		int index = 0;
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			count[arr[i]]++;
			sum += arr[i];
		}
		int average = sum / 10;
		for(int i = 0; i < count.length; i++) 
		{
			if(count[i] > max) {
				max = count[i];
				index = i;
			}
		}
		System.out.println(average);
		System.out.println(index);
		// TODO Auto-generated method stub

	}

}
