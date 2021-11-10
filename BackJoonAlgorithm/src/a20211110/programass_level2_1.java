package a20211110;

import java.util.*;
//2019 카카오 블라인드 채용 level2 == 오픈채팅방

public class programass_level2_1 {
	
	public static String[] solution(String record[]) {
		String[] answer;
		HashMap<String,String> hash = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		int k = 0;
		for(int i = 0; i < record.length; i++) {
			String ans[] = record[i].split(" "); //공백을 기준으로 나눠서 ans배열에 추가
			if(ans[0].equals("Enter")) {
				hash.put(ans[1], ans[2]);
				list.add(ans[1]+"님이 들어왔습니다."); 
				
			}
			else if(ans[0].equals("Leave")) {
				list.add(ans[1]+"님이 나갔습니다.");
			}
			else if(ans[0].equals("Change")) {
				hash.put(ans[1], ans[2]);
			}
		}
	
		
		answer = new String[list.size()];
		
		
		
		
		for(String s : list) {
			int end = s.indexOf("님");
			String tmp = s.substring(0,end);
			answer[k++] = s.replace(tmp, hash.get(tmp));
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		String record[] = {
				"Enter uid1234 Muzi",
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid4567 Ryan"};
		
		String result[] = solution(record);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
