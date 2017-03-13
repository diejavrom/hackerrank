package ar.com.javi.ex.maths.leonardoandprime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73};
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        List<BigInteger> inputs = new ArrayList<>(T);
        for(int a0 = 0; a0 < T; a0++){
            BigInteger N = in.nextBigInteger();
        	inputs.add(N);
        }
        in.close();
        for(BigInteger t : inputs) {
        	BigInteger acum = BigInteger.ONE;
        	int cantFactors = 0;
        	for(int i=0; i<primes.length;i++) {
        		acum = acum.multiply(new BigInteger(primes[i]+""));
        		if(acum.compareTo(t) > 0) {
        			break;
        		}
        		cantFactors++;
        	}
        	System.out.println(cantFactors);
        }
    }
}