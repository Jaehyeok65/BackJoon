package a20221116;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a1296 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String teamName = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int[] rank = new int[N];
		String[] str = new String[N];

		for(int i=0; i<N; i++){
			str[i] = br.readLine();
		}
		
		Arrays.sort(str);
		
		int max = 0;
		for (int i = 0; i < N; i++) {	
			rank[i] = solve(teamName, str[i]);
			max = Math.max(max, rank[i]);
		}
		
		for(int i=0; i<N; i++){
			if(max == rank[i]){
				System.out.println(str[i]);
				break;
			}
		}

	}

	public static int solve(String teamName, String str) {

		int L = 0;
		int O = 0;
		int V = 0;
		int E = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'L'){
				L++;
			}else if(str.charAt(i) == 'O'){
				O++;
			}else if(str.charAt(i) == 'V'){
				V++;
			}else if(str.charAt(i) == 'E'){
				E++;
			}
		}

		for (int i = 0; i < teamName.length(); i++) {
			if(teamName.charAt(i) == 'L'){
				L++;
			}else if(teamName.charAt(i) == 'O'){
				O++;
			}else if(teamName.charAt(i) == 'V'){
				V++;
			}else if(teamName.charAt(i) == 'E'){
				E++;
			}
		}

		return ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100;

	}

}