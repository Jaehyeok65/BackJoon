package a20211116;


import java.util.*;


public class programass_level_6 {
	static int ans = 0;
	
	
	public static int solution(int [] number, int target) {
		
		
		dfs(0,0,number,target);
		
		return ans;
		
		
	}
	
	
	public static void dfs(int sum, int index, int [] number, int target) {
		
		if(index == number.length) {
			if(sum == target) {
				ans += 1;
			}
			return;
		}
		
		
		
		dfs(sum + number[index],index+1,number,target);
		dfs(sum - number[index],index+1,number,target);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] number = {1,1,1,1,1};
		int k = 3;
		System.out.print(solution(number,k));
	}

}
