package a20220829;



import java.util.*;
import java.io.*;


public class a5397 {
	
	
	static char cursor = '*';
	
	public static String solved(String s) {
		LinkedList<Character> list = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		list.add(cursor); //최초로 커서를 넣어줌
		for(int i = 0; i < s.length(); i++) {
			int index = list.indexOf(cursor);
			if(s.charAt(i) == '<') {
				//System.out.print(index);
				if(list.size() == 1 && list.getFirst() == cursor) {
					continue;
				}
				list.remove(index);
				index = index - 1 < 0 ? 0 : index - 1;
				list.add(index,cursor);
			}
			else if(s.charAt(i) == '>') {
				if(index == list.size() - 1 || (list.size() == 1 && list.getFirst() == cursor)) {
					continue;
				}
				else {
					list.remove(index);
					index = index + 1 > list.size()  ? list.size() - 1 : index + 1;
					list.add(index,cursor);
				}
				
			}
			else if(s.charAt(i) == '-') {
				if(list.size() == 1 && list.getFirst() == cursor) {
					continue;
				}
				list.remove(index-1);
			}
			else {
			list.add(index, s.charAt(i));
			
			}
		}
		/*int index = list.indexOf(cursor);
		list.remove(index);*/
		
		for(char c : list) {
			sb.append(c);
		}
		
		return sb.toString();
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			sb.append(solved(s)+"\n");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
