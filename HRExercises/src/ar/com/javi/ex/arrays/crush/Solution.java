package ar.com.javi.ex.arrays.crush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String readLine = br.readLine();
			String[] firstLine = readLine.split(" ");
			Integer N = Integer.valueOf(firstLine[0]);
			Integer M = Integer.valueOf(firstLine[1]);
			
			List<Integer[]> emes = new ArrayList<>(M);
			for(int i=1; i<=M; i++) {
				String[] line = br.readLine().split(" ");
				emes.add(new Integer[]{Integer.valueOf(line[0]),Integer.valueOf(line[1]),Integer.valueOf(line[2])});
			}

			Integer[] A = IntStream.range(0, N-1).mapToObj(x -> 0).toArray(size -> new Integer[size]);
			for(Integer[] m : emes) {
				A[m[0]-1] += m[2];
				if(m[1] < A.length) {
					A[m[1]] -= m[2];
				}
			}
			br.close();
			Arrays.stream(A).forEach(System.out::println);
			
			System.err.println("##########");
			
			Integer[] P = new Integer[A.length+1];
			P[0]=0;
			for(int i=0; i<A.length; i++) {
				P[i] = P[i-1]+A[i];
			}
			Arrays.stream(P).forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}