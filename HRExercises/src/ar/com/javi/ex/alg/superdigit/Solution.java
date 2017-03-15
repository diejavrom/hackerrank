package ar.com.javi.ex.alg.superdigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	//https://www.hackerrank.com/challenges/recursive-digit-sum

    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
			String x = line[0].trim();
			Integer k = Integer.valueOf(line[1].trim());
			System.out.println(superdigit((k*Integer.valueOf(superdigit(x)))+""));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static String superdigit(String x) {
		if(x.length() < 2) {
			return x;
		} else {
			char[] charArray = x.toString().toCharArray();
			Integer acum = 0;
			for(char c : charArray) {
				acum += Integer.valueOf(""+c);
			}
			return superdigit(acum+"");
		}
	}

}