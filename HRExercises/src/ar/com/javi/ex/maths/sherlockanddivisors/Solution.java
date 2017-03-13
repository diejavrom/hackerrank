package ar.com.javi.ex.maths.sherlockanddivisors;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer casos = Integer.valueOf(br.readLine().trim());
			List<Integer> inputs = new ArrayList<Integer>();
			for(int i=0; i<casos;i++) {
				String[] line = br.readLine().trim().split(" ");
				inputs.add(Integer.valueOf(line[0].trim()));
			}
			for(Integer r : inputs) {
				System.out.println(countPairDivisors(r));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Integer countPairDivisors(Integer n) {
		Integer cant = 0;
		if(n %2==1) {
			return cant;
		} else {
			Map<Integer, Integer> primeFactors = primeFactors(n);
			cant = 1;
			for(Integer p : primeFactors.keySet()) {
				if(p != 2) {
					cant *= (primeFactors.get(p)+1);
				}
			}
			cant --;
			cant *= primeFactors.get(2);
			cant += primeFactors.get(2);
		}
		return cant;
	}

	public static Map<Integer, Integer> primeFactors(int n) {
		Map<Integer, Integer> factors = new HashMap<>();
        while (n%2==0){
            n /= 2;
            Integer f2 = factors.get(2);
            if(f2 == null) {
            	f2=1;
            } else {
            	f2++;
            }
            factors.put(2, f2);
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n%i == 0) {
                n /= i;
                Integer fi = factors.get(i);
                if(fi == null) {
                	fi=1;
                } else {
                	fi++;
                }
                factors.put(i, fi);
            }
        }
        if (n > 2) {
            Integer fn = factors.get(n);
            if(fn == null) {
            	fn=1;
            } else {
            	fn++;
            }
            factors.put(n, fn);
        }
        return factors;
    }

}