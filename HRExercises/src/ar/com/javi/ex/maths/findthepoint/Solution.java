package ar.com.javi.ex.maths.findthepoint;

import java.awt.Point;
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
			List<Point> rs = new ArrayList<Point>();
			for(int i=0; i<srN; i++) {
				String points = br.readLine();
				String[] coordStr = points.split(" ");
				Point p = new Point(Integer.valueOf(coordStr[0]), Integer.valueOf(coordStr[1]));
				Point q = new Point(Integer.valueOf(coordStr[2]), Integer.valueOf(coordStr[3]));
				Point r = new Point((int)(q.getX() + (q.getX()-p.getX())), (int)(q.getY() + (q.getY()-p.getY())));
				rs.add(r);
			}
			Iterator<String> it = rs.stream().map((s) -> (int)s.getX() + " " + (int)s.getY() ).iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}