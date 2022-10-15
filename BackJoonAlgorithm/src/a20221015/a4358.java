package a20221015;

import java.util.*;
import java.io.*;




public class a4358 {
	static String input;
	static HashMap<String,Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Float> map = new HashMap<>();

        float count = 0f;

        String str = "";

        while((str= bf.readLine())!=null){
            map.put(str, map.getOrDefault(str,0f)+1f);
            count++;
        }


        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(String key : keys){
            System.out.print(key+" ");
            System.out.println(String.format("%.4f",map.get(key)/count*100));
        }
		// TODO Auto-generated method stub

	}

}
