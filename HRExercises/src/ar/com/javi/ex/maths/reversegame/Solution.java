package ar.com.javi.ex.maths.reversegame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer casos = Integer.valueOf(br.readLine().trim());
			List<Integer> result = new ArrayList<Integer>();
			for(int i=0; i<casos;i++) {
				String[] line = br.readLine().trim().split(" ");
				Integer N = Integer.valueOf(line[0].trim());
				Integer index = Integer.valueOf(line[1].trim());
				Integer r = null;
				Integer to = N;
				N--;
				Integer j=0;
				for(int jj=0; jj < to/2; jj++) {
					if(index.equals(N)) {
						r=2*j;
						break;
					}
					if(index.equals(j)) {
						r=2*j+1;
						break;
					}
					N--;
					j++;
				}
				if(r==null && index.equals(N)) {
					r=to-1;
				}
				result.add(r);
			}
			for(Integer r : result) {
				System.out.println(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}