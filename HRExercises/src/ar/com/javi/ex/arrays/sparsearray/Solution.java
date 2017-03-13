package ar.com.javi.ex.arrays.sparsearray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer srN = Integer.valueOf(br.readLine());
			List<String> strings = new ArrayList<String>(srN);
			for(int i=0; i<srN; i++) {
				strings.add(br.readLine());
			}
			Integer qrN = Integer.valueOf(br.readLine());
			List<String> querys = new ArrayList<String>(qrN);
			for(int i=0; i<qrN; i++) {
				querys.add(br.readLine());
			}
			for(String q : querys) {
				Optional<Integer> reduced = strings.stream().map((s)-> s.equals(q) ? 1 : 0).reduce((v1,v2) -> v1+v2);
				reduced.ifPresent(System.out::println);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
