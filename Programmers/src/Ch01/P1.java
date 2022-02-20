package Ch01;

import java.util.HashMap;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b = {"josipa", "filipa", "marina", "nikola"};
		String c = solution(a,b);
		System.out.println(c);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
		for (String key : hm.keySet()) {
			if(hm.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}
}
