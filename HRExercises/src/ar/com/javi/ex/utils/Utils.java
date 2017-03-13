package ar.com.javi.ex.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Utils {
	
	public static void main(String[] args) {
		System.out.println(gcd(2,8));
		System.out.println(criba(10000));
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

	private static List<Integer> criba(Integer N) {
		int[] criba = IntStream.rangeClosed(1, N).toArray();
		criba[0] = -1;
		int i = 0;
		while(criba[i] <= Math.sqrt(N)) {
			if(criba[i] != -1) {
				int prime = criba[i];
				for(int j=2; prime*j<=N; j++) {
					criba[prime*j-1] = -1;
				}
			}
			i++;
		}
		List<Integer> cribaLst = new ArrayList<>();
		for(int k=0; k<criba.length; k++) {
			if(criba[k] != -1) {
				cribaLst.add(criba[k]);
			}
		}
		return cribaLst;
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

	public static String repeat(String token, int veces) {
		return IntStream.range(1, veces+1).mapToObj(x -> token).reduce("", (x,y) -> x+y);
	}

}