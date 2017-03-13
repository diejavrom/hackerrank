package ar.com.javi.ex.alg.simplearraysum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			String b = br.readLine();
			System.out.println(simpleArraySum(b));    
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static int simpleArraySum(String b) {
		String[] array = b.split(" ");
		return Arrays.asList(array).stream().map(s -> Integer.valueOf(s)).reduce(0, (x,y) -> x+y);
	}

}