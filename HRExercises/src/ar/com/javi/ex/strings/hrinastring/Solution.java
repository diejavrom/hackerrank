package ar.com.javi.ex.strings.hrinastring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	List<String> results = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            results.add(encontrarPalabra(s, "hackerrank"));
        }
        for(String r : results) {
        	System.out.println(r);
        }
        in.close();
    }

	private static String encontrarPalabra(String s, String word) {
		int iw = 0;
		for(int is=0;is<s.length() && iw < word.length();is++) {
			if(s.charAt(is) == word.charAt(iw)) {
				iw++;
			}
		}
		if(iw == word.length()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}