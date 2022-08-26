package a20211010;


import java.util.*;


public class a1411 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		int count = 0;
		
		boolean flag = true;  //전체가 다 같거나, 전체가 다 달라야 조건 성립
		boolean check = true;
		for(int i = 0; i < n; i++) {  //전체를 반복하기 위한 반복문
			
			for(int j = i + 1; j < n; j++) {
				check = true;
				flag = true;
				for(int m = 1; m < arr[i].length(); m++) {
					if(arr[i].charAt(m) != arr[i].charAt(m-1)) {
						check = false;
						break;
					}
				}
				if(check) {
					for(int m = 0; m < arr[i].length(); m++) {
						for(int u = 0; u < arr[j].length(); u++) {
							if(arr[i].charAt(m) == arr[j].charAt(u)) {
								flag = false;
								break;
							}
							else {
								for(int o = 1; o < arr[j].length(); o++) {
									if(arr[j].charAt(o) != arr[j].charAt(o-1)) {
										flag = false;
										break;
									}
								}
							}
						}
						if(!flag) {
							break;
						}
					}
					if(flag) {   //문자열이 모두 같은 경우 상대 문자열이 같지 않으면 
						count++;
						System.out.println(arr[i] + " " + arr[j]);
					}
					
				}
				else {        //문자열이 같은 문자열이 아닌 경우
					boolean checked = true;
					for(int o = 1; o < arr[j].length(); o++) {
						if(arr[j].charAt(o) != arr[j].charAt(o-1)) {
							checked = false;
							break;
						}
					}
					
					if(!checked) {
					for(int m = 0; m < arr[i].length(); m++) {
						for(int u = 0; u < arr[j].length(); u++) {
							if(arr[i].charAt(m) == arr[j].charAt(u)) {
								flag = false;
								break;
							}
						}
						if(!flag) {
							break;
						}
					}
					if(flag) {
						count++;
						System.out.println(arr[i] + " " + arr[j]);
					}
					}
			}
			}
		}
		
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
