package ar.com.javi.ex.arrays.arrayds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			List<String> asList = Arrays.asList(br.readLine().split(" "));
			Collections.reverse(asList);
			asList.stream().map((a)-> a+" ").forEach(System.out::print);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
