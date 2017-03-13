package ar.com.javi.ex.alg.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

	  public static void main(String[] args) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Integer N = Integer.valueOf(br.readLine());
				System.out.println(staircase(N));    
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

		private static String staircase(Integer N) {
			List<String> escalones = new ArrayList<>(N);
			for(int i=1; i<=N; i++) {
				escalones.add(repeat(" ",N-i) + repeat("#",i) + (i==N ? "":"\n"));
			}
			return escalones.stream().reduce("", (x,y)->x+y);
		}

		public static String repeat(String token, int veces) {
			return IntStream.range(1, veces+1).mapToObj(x -> token).reduce("", (x,y) -> x+y);
		}

}
