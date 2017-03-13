package ar.com.javi.ex.maths.pickingcards;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	private static Integer MOD = 1000000007;
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer casos = Integer.valueOf(br.readLine().trim());
			List<Long> result = new ArrayList<Long>();
			for(int i=0; i<casos;i++) {
				Integer N = Integer.valueOf(br.readLine().trim());
				String[] l = br.readLine().split(" ");
				Long res = calcResult(l, N);
				result.add(res);
			}
			for(Long res : result) {
				System.out.println(res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Long calcResult(String[] l, Integer N) {
		int[] hist = hist(l, N);
		Long acum = 1l;
		int cant = 0;
		for(int i=0; i<N;i++) {
			if(hist[i]+(cant-i) > 0) {
				cant = hist[i]+cant;
				acum = acum * (cant-i) % MOD;
			} else {
				acum=0l;
				break;
			}
		}
		return acum % MOD;
	}

	private static int[] hist(String[] l, int N) {
		int[] hist = new int[N+1];
		for(int i=0; i<N; i++) {
			int intValue = Integer.valueOf(l[i].trim()).intValue();
			hist[intValue] = hist[intValue] +1; 
		}
		return hist;
	}

}