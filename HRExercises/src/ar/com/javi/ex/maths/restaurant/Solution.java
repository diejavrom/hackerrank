package ar.com.javi.ex.maths.restaurant;

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
				String[] line = br.readLine().trim().split(" ");
				Integer l = Integer.valueOf(line[0].trim());
				Integer b = Integer.valueOf(line[1].trim());
				Integer gcd = gcd(l,b);
				result.add((l/gcd) * (b/gcd));
			}
			for(Integer r : result) {
				System.out.println(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Integer gcd(Integer a, Integer b) {
		Integer r;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}