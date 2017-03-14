package ar.com.javi.ex.alg.minmaxsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String b = br.readLine();
			printMinMaxSum(b.split(" "));    
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static void printMinMaxSum(String[] numbers) {
		Long min = Long.MAX_VALUE;
		Long max = Long.MIN_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			Long current=0l; 
			for(int  j=0; j<numbers.length; j++) {
				current += (j==i ? 0 : Long.valueOf(numbers[j])); 
			}
			min = Math.min(current, min);
			max = Math.max(current, max);
		}
		System.out.println(min + " " + max);
	}

}