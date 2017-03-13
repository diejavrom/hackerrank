package ar.com.javi.ex.maths.posiblepath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer casos = Integer.valueOf(br.readLine().trim());
			List<String> result = new ArrayList<String>();
			for(int i=0; i<casos;i++) {
				String[] l = br.readLine().split(" ");
				String res = calcResult(new BigInteger(l[0].trim()), new BigInteger(l[1].trim()), new BigInteger(l[2].trim()), new BigInteger(l[3].trim()));
				result.add(res);
			}
			for(String res : result) {
				System.out.println(res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String calcResult(BigInteger a, BigInteger b, BigInteger x, BigInteger y) {
		return gcd(a,b).equals(gcd(x,y)) ? "YES" : "NO";
	}

	private static BigInteger gcd(BigInteger a, BigInteger b) {
		BigInteger r;
		while (!b.equals(BigInteger.ZERO)) {
			r = a.remainder(b);
			a = b;
			b = r;
		}
		return a;
	}

}