package Ch01;

import java.util.HashMap;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < clothes.length; i++) {
			hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		for(String key : hm.keySet()) {
			answer = answer * (hm.get(key) + 1);
		}
		return answer - 1;
	}
}
