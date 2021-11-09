package a20211109;

import java.util.*;


class dot {
	String name;
	int index;
	
	public dot(String name, int index) {
		this.name = name;
		this.index = index;
	}
}
public class program3 {
	
	public static String solution(int n, int k, String[] cmd) {
		String answer = "";
		String [] table = {"무지","콘","어피치","제이지","프로도","네오","튜브","라이언"};
		String [] copytable = new String[n];
		for(int i = 0; i < n; i++) {
			copytable[i] = table[i];
		}
		Stack<dot> stack = new Stack<>();
		int tablelength = table.length; //초기에 배열의 길이를 지정.
		int checkindex = k;
		for(String i : cmd) {
			if(i.charAt(0) == 'U') {
				int index = i.charAt(2) - '0';
				if(checkindex - index < 0) continue;
				checkindex = checkindex - index;
			}
			else if(i.charAt(0) == 'D') {
				int index = i.charAt(2) - '0';
				if(checkindex + index >= tablelength) continue;
				checkindex = checkindex + index;
			}
			else if(i.charAt(0) == 'C') {
				if(checkindex == tablelength - 1) { //삭제할 원소가 맨 마지막 원소라면
					stack.add(new dot(table[checkindex],checkindex)); //최근에 삭제한 원소를 스택에 추가
					table[checkindex] = "";  //해당 원소를 비우고
					tablelength -= 1;        //테이블의 길이를 1감소시킴
				}
				else {                             //삭제할 원소가 맨 마지막 원소가 아니라면
				stack.add(new dot(table[checkindex],checkindex));  //최근에 삭제한 원소를 스택에 추가
				for(int j = checkindex; j < tablelength-1; j++) { //원소를 한칸 씩 앞으로 이동시킴
					table[j] = table[j+1];
				}
				tablelength -= 1;
				}
				
			}
			else if(i.charAt(0) == 'Z') { //최근 삭제한 원소를 복구
				dot d = stack.pop(); //가장 최근 삭제한 원소를 pop함.
				int index = d.index; //인
				for(int j = tablelength; j > index; j--) {
					table[j] = table[j-1];
				}
				table[index] = d.name;
				tablelength += 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			boolean check = false;
			for(int j = 0; j < tablelength; j++) {
				if(copytable[i].equals(table[j])) {
					answer += "O";
					check = true;
					break;
				}
			}
			if(!check) {
				answer += "X";
			}
		}
		
		for(int i = 0; i < tablelength; i++) {
			System.out.print(table[i]+ " ");
		}
		System.out.println("");
		return answer;
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //표의 행 개수를 나타내는 변수
		int k = sc.nextInt(); //현재 선택돼있는 행을 나타내는 변수
		String [] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
		String result = solution(n,k,cmd);
		System.out.print(result);
		// TODO Auto-generated method stub

	}

}
