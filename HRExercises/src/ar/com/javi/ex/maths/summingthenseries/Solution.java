package ar.com.javi.ex.maths.summingthenseries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	private static final Long MOD = Double.valueOf(Math.pow(10, 9)).longValue() + 7;

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer N = Integer.valueOf(br.readLine());
			List<Long> rs = new ArrayList<Long>();
			for(int i=0; i<N; i++) {
				Long testcase = Long.valueOf(br.readLine());
				rs.add(testcase);
			}
			Iterator<BigInteger> it = rs.stream().map((s) -> S_N(s).mod(new BigInteger(MOD.toString()))).iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static BigInteger S_N(Long n) {
		return sumSqr(n).subtract(sumSqr(n-1));
	}

	public static BigInteger sumSqr(Long n) {
		BigInteger nBI = new BigInteger(n.toString());
		BigInteger nBI2Mas1 = nBI.multiply(new BigInteger("2")).add(BigInteger.ONE);
		BigInteger nBIMas1 = nBI.add(BigInteger.ONE);
		return nBI.multiply(nBI2Mas1).multiply(nBIMas1).divide(new BigInteger("6"));
	}

}