package ar.com.javi.ex.alg.diagonaldifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer N = Integer.valueOf(br.readLine());
			Integer[][] matrix = new Integer[N][N];
			for(int i=0; i<N; i++) {
				String line = br.readLine();
				String[] rowArray = line.split(" ");
				for(int j=0;j<N;j++) {
					matrix[i][j] = Integer.valueOf(rowArray[j]);
				}
			}
			System.out.println(diagonalDifference(N, matrix));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static int diagonalDifference(Integer N, Integer[][] matrix) {
		int d1 = 0;
		for(int i=0; i < N; i++) {
			d1 += matrix[i][i];
		}
		int d2 = 0;
		for(int i=0; i < N; i++) {
			d2 += matrix[i][N-i-1];
		}
		return Math.abs(d1-d2);
	}

}