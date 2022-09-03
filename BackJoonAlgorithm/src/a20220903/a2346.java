package a20220903;



import java.util.*;
import java.io.*;

public class a2346 { //안되면 두 개의 스택을 쓰는 방법도 고려해볼 것

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		int n = sc.nextInt();
		int point = 0; //현재 위치를 가리키는 포인터
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> index = new LinkedList<>();
		
		
		for(int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			list.add(i);
			index.add(num);
		}
		
		sb.append(list.poll() + " "); //처음에 1을 꺼냄
		int in = index.poll(); //1을 꺼내서 터뜨린 풍선의 값을 in 변수에 저장
		
		while(list.size() > 0) { //list가 비어있지 않다면 반복문 진행
			
			if(in > 0) { //풍선을 터뜨려서 꺼낸 index가 양수라면 오른쪽 진행
				if(point == list.size() - 1) { //포인트가 마지막 리스트라면 제거되어도 인덱스 변화가 없음
					point = point + in;
				}
				else {
				point =  point + (in-1);
				}//이미 풍선은 제거했으므로 리스트 크기가 1 제거됨 == 한칸을 이동했다고 침
				if(point >= list.size()) { //1과 n이 연결되있다치므로 마지막 index보다 더 
					point = point - list.size();
				}
				System.out.println("포인터 : " + point + "크기 : " + list.size());
				sb.append(list.remove(point) +" ");
				in = index.remove(point);
			}
			else { //풍선을 터뜨려서 꺼낸 index가 음수라면 왼쪽으로 진행
				point = point + in;
				if(point < 0) {
					point = point + list.size();
				}
				System.out.println("포인터 : " + point + "크기 : " + list.size());
				sb.append(list.remove(point) + " ");
				in = index.remove(point);
			}
			
		}
		
		System.out.print(sb.toString());
		
		
		
		
		
		
		

		
		
		
	
		
		// TODO Auto-generated method stub

	}

}
