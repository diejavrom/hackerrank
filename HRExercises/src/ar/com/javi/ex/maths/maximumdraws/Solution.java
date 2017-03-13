package ar.com.javi.ex.maths.maximumdraws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer srN = Integer.valueOf(br.readLine());
			List<Integer> rs = new ArrayList<Integer>();
			for(int i=0; i<srN; i++) {
				Integer cantSockets = Integer.valueOf(br.readLine());
				rs.add(cantSockets);
			}
			Iterator<Integer> it = rs.stream().map((s) -> s+1 ).iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}