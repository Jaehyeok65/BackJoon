package bronze2;


import java.util.*;


public class a15969 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int score[] = new int[n];
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		System.out.println(score[score.length-1] - score[0]);
		
		// TODO Auto-generated method stub

	}

}
