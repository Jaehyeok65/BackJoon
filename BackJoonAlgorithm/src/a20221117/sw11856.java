package a20221117;

import java.io.*;




public class sw11856 {
	
	static int T;
	
	public static String solve(String s) {
		String first = s.substring(0,1);
		String second = "";
		boolean flag = false;
		int firstcount = 1;
		int secondcount = 0;
		for(int i = 1; i < s.length(); i++) {
			String target = s.substring(i,i+1);
			if(flag) { //두번째 문자열까지 등장했을 때
				if(target.equals(first)) {
					firstcount++;
				}
				else if(target.equals(second)) {
					secondcount++;
				}
				else {
					return "No";
				}
			}
			else { //두번재 문자열이 등장하지 않았을 때
				if(!target.equals(first)) { //첫번째 문자열과 다르다면 두번째 문자열이라는 뜻이므로 
					second = s.substring(i,i+1); //second에 초기화시켜주며
					flag = true; //flag를 true로 만들어 두번째 문자열까지 나왔다고 알림
					secondcount++;
				}
				else { //첫번째 문자열과 같다면 개수 증가
					firstcount++;
				}
			}
		}
		
		if(firstcount == 2 && secondcount == 2) {
			return "Yes";
		}
		else {
			return "No";
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= T; i++) {
			
			String s = br.readLine();
			
			
			String result = solve(s);
			sb.append("#"+i+" "+result+"\n");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
