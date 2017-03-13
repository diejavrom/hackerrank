package ar.com.javi.ex.maths.handshake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	List<Integer> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
        	result.add(N*(N-1)/2);
        }
        in.close();
        for(Integer t : result) {
        	System.out.println(t);
        }
    }
}
