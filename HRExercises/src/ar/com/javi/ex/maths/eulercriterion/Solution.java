package ar.com.javi.ex.maths.eulercriterion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
 
public class Solution {
 
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Integer N = Integer.valueOf(br.readLine().trim());
            List<String> rs = new ArrayList<String>();
            for(int i=0; i<N; i++) {
                String[] split = br.readLine().split(" ");
                rs.add(testEulerCriterion(Integer.valueOf(split[0].trim()), Integer.valueOf(split[1].trim())));
            }
            for(String r : rs) {
                System.out.println(r);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static String testEulerCriterion(Integer A, Integer M) {
    	if(A.equals(0)) {
    		return "YES";
    	} else if(M % 2 == 0){
    		return "NO";
    	} else {
    		BigInteger aBI = new BigInteger(A.toString());
    		BigInteger bigInteger = new BigInteger(M.toString());
    		BigInteger remainder = aBI.modPow(new BigInteger((M-1)/2 + ""), bigInteger);
    		return remainder.equals(BigInteger.ONE) ? "YES" : "NO";
    	}
    }

}