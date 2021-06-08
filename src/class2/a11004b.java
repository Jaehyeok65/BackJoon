package class2;

import java.util.*;
import java.io.*;

public class a11004b {
	
	static int partition(int arr[],int left,int right) { //중간값을 기준으로 왼쪽과 오른쪽을 정렬
		
		int pivot = arr[(left + right) / 2]; //정렬을 수행할 기준 값
		
		while(left < right) { //left가 right보다 커질 때 반복을 종료 (정렬이 다 되었다는 뜻)
			while(arr[left] < pivot && left < right) 
				left++;
			while(arr[right] > pivot && right > left)
				right--;
			
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return left; //정렬 후 중간값의 인덱스를 리턴
	}
	
	static void quicksort(int arr[], int left, int right) { //분할된 왼쪽과 오른쪽에 각각 재귀호출을 통해 정렬
		
		if(left < right) {
			
			int pivotindex = partition(arr,left,right);
			
			quicksort(arr,left,pivotindex - 1);
			quicksort(arr,pivotindex + 1,right);
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st1.nextToken());
		int k = Integer.parseInt(st1.nextToken());
		
		int arr[] = new int[n];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		quicksort(arr,0,arr.length-1);
		System.out.print(arr[k-1]);
		
		// TODO Auto-generated method stub

	}

}
