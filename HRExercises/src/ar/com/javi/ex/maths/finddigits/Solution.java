package ar.com.javi.ex.maths.finddigits;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer casos = Integer.valueOf(br.readLine().trim());
			List<Integer> result = new ArrayList<Integer>();
			for(int i=0; i<casos;i++) {
				Integer N = Integer.valueOf(br.readLine().trim());
				result.add(calcCantDigist(N));
			}
			for(Integer res : result) {
				System.out.println(res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Integer calcCantDigist(Integer N) {
		Integer res = 0;
		String strN = N.toString();
		Integer[] digistArray = new Integer[10];
		for(int i=0; i<strN.length();i++) {
			int digit = new Integer(strN.charAt(i)+"");
			if(digistArray[digit] == null) {
				digistArray[digit] = 0;
			}
			digistArray[digit] ++;
		}
		for(int i=0; i<10; i++) {
			res += ((i == 0 || digistArray[i] == null || N % i != 0) ? 0 : digistArray[i]); 
		}
		return res;
	}

}