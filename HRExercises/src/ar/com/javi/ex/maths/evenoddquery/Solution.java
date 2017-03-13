package ar.com.javi.ex.maths.evenoddquery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();
			List<String> asList = Arrays.asList(br.readLine().split(" "));
			Object[] Aobj = asList.stream().map((s) -> Integer.valueOf(s)).toArray();
			Integer[] A = new Integer[Aobj.length];
			for(int i=0; i<Aobj.length; i++) {
				A[i] = Integer.valueOf(Aobj[i].toString());
			}
			Integer Q = Integer.valueOf(br.readLine());
			List<String> querys = new ArrayList<>(Q);
			for(int i=0; i<Q; i++) {
				querys.add(br.readLine());
			}
			br.close();
			for(String query : querys) {
				String[] split = query.split(" ");
				Integer x = Integer.valueOf(split[0]);
				Integer y = Integer.valueOf(split[1]);
				//calculo find(x,y)
				if(A[x-1] % 2 == 0) {
					if(x < A.length && A[x]==0 && !x.equals(y)) {
						System.out.println("Odd"); //tiene exponente cero => a^0=1, impar
					}else {
						System.out.println("Even"); //base par => par
					}
				} else {
					System.out.println("Odd"); //base impar => impar
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}