package ar.com.javi.ex.maths.ncrtable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	private static final Long MOD = new Double(Math.pow(10d, 9d)).longValue();

	public static void main(String[] args) {
		try {
			Map<Integer, String> printMap = new HashMap<>();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer testcases = Integer.valueOf(br.readLine());
			List<Integer> inputs = new ArrayList<Integer>();
			Integer theMax = Integer.MIN_VALUE;
			for(int i=0; i<testcases; i++) {
				Integer N = Integer.valueOf(br.readLine());
				inputs.add(N);
				theMax = Math.max(theMax, N);
			}
			br.close();
			List<Long> coefs = new ArrayList<>();
			coefs.add(1l);

			for(int r=1 ; r<=theMax+1; r++) {
				List<Long> coefsRes = new ArrayList<>();
				coefsRes.addAll(coefs);
				coefs.clear();
				coefs.add(coefsRes.get(0));
				for(int i=1; i<(r%2==0?r/2:r/2+1);i++) {
					if(i-1 < coefsRes.size() && i < coefsRes.size()) {
						long coef = (coefsRes.get(i-1)+coefsRes.get(i)) % MOD;
						coefs.add(coef);
					}
				}	
				List<Long> tmp = new ArrayList<>(coefs.subList(0, r%2==0 ? coefs.size() : coefs.size()-1));
				Collections.reverse(tmp);
				coefs.addAll(tmp);
				printMap.put(r, toFormatPrint(coefs.toString()));
			}
			for(Integer N : inputs) {
				System.out.println(printMap.get(N+1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String toFormatPrint(String string) {
		return string.substring(1, string.length()-1).replaceAll(",", "");
	}

}