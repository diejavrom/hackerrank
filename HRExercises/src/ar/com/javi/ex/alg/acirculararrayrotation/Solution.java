package ar.com.javi.ex.alg.acirculararrayrotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * No está completo!
 * El test #44 no lo pasa
 * @author Javier Romero
 */
public class Solution {

    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
		
			int k=Integer.valueOf(line[1]);
			int q=Integer.valueOf(line[2]);

			String[] array = br.readLine().split(" ");
			List<String> result = new ArrayList<>(q);
			for(int i=0; i<q; i++) {
				Integer m = Integer.valueOf(br.readLine().trim());
				result.add(searchElement(array, k, m));
			}
			for(String r : result) {
				System.out.println(r.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static String searchElement(String[] array, int k, Integer m) {
		if(m < k) {
			return array[(array.length - k + m) % array.length];
		} else {
			return array[(m-k) % array.length];
		}
	}

}