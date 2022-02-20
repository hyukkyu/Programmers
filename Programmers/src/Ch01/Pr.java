package Ch01;

import java.util.HashMap;

public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"123", "456", "789"};
		boolean b = solution(a);
		System.out.println(b);
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < phone_book.length; i++) {
			hm.put(phone_book[i], i);
		}
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				if(hm.containsKey(phone_book[i].substring(0, j))) {
					answer = false;
					return false;
				} else {
					answer = true;
				}
			}
		}
		
		return answer;
		
	}
}
