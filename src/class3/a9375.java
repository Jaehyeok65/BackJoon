package class3;

import java.util.*;
import java.io.*;


public class a9375 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		ArrayList<String> list = new ArrayList<>(); //리스트에 key값을 넣음
		StringBuilder sb = new StringBuilder();
		
		while(Test --> 0) {
			
			int n = sc.nextInt(); //의상의 수
			
			for(int i = 0; i < n; i++) {
				String value = sc.next();
				String key = sc.next();
				list.add(key);
			}
			boolean flag = false; //이미 나왔던 종류인가를 확인
			int result = list.size(); //
			int count = 1; //옷의 종류 수
			  for(int i = 0; i < list.size()-1; i++) {
				if(!(list.get(i).equals(list.get(i+1)))) { //의상의 종류가 다르다면
					for(int j = 0; j < i; i++) {
						if(list.get(i+1).equals(list.get(j))) { //이미 나왔던 종류인지를 확인
							flag = true; //이미 나왔던 종류인가를 확인
							break; //이미 나왔던 종류라면 루프를 멈춤
						}
					}
					if(!flag) { //루프가 끝나고 이미 나왔던 종류가 아니라면 옷의 종류를 한가지 추가시킴
						count++;
					}
				}
			}
			  if(count == 1) { //옷의 종류가 하나밖에 없다는 것을 의미
				  sb.append(result+"\n");
			  }
			  else { //옷의 종류가 하나 이상이라는 것을 의미.
				  result = result * count;
				  result = result-1;
				  sb.append(result+"\n");
			  }
			  list.clear();
			
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
