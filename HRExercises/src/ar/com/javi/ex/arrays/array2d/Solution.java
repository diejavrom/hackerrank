package ar.com.javi.ex.arrays.array2d;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) {
		try {
			int[][] matrix = new int[6][6];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0; i<6;i++) {
				String[] line = br.readLine().split(" ");
				int j=0;
				for(String v : line) {
					matrix[i][j] = Integer.valueOf(v);
					j++;
				}
			}
			br.close();
			int maxsumh = Integer.MIN_VALUE;
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(j+2<6 && i+2<6) {
						int sumh = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
						if(sumh > maxsumh) {
							maxsumh = sumh;
						}
					}
				}
			}
			System.out.println(maxsumh);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
