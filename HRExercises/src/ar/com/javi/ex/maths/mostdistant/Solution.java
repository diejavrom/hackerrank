package ar.com.javi.ex.maths.mostdistant;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer puntos = Integer.valueOf(br.readLine().trim());
			double minX=Integer.MAX_VALUE;
			double minY=Integer.MAX_VALUE;
			double maxX=Integer.MIN_VALUE;
			double maxY=Integer.MIN_VALUE;
			for(int i=0; i<puntos;i++) {
				String[] l = br.readLine().split(" ");
				double tmpX = Double.valueOf(l[0].trim());
				double tmpY = Double.valueOf(l[1].trim());
				minX = Math.min(tmpX, minX);
				minY = Math.min(tmpY, minY);
				maxX = Math.max(tmpX, maxX);
				maxY = Math.max(tmpY, maxY);
			}
			minX = minX/1000000d;
			minY = minY/1000000d;
			maxX = maxX/1000000d;
			maxY = maxY/1000000d;
			double dist1 = (double)(maxY - minY);
			double dist2 = (double)(maxX - minX);
			Double dist3 = Math.sqrt(Math.abs(maxX)*Math.abs(maxX) + Math.abs(maxY)*Math.abs(maxY));
			Double dist4 = Math.sqrt(Math.abs(minX)*Math.abs(minX) + Math.abs(maxY)*Math.abs(maxY));
			Double dist5 = Math.sqrt(Math.abs(maxX)*Math.abs(maxX) + Math.abs(minY)*Math.abs(minY));
			Double dist6 = Math.sqrt(Math.abs(minX)*Math.abs(minX) + Math.abs(minY)*Math.abs(minY));
			double maxDistance = Math.max(dist1, Math.max(dist2, Math.max(dist3, Math.max(dist4, Math.max(dist5, dist6)))));
			System.out.println(maxDistance*1000000d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}