package ar.com.javi.ex.strings.bigsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> asList = new ArrayList<>(n);
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
        	asList.add(in.next());
        }
        
    	Collections.sort(asList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				} else if(o1.length() > o2.length()) {
					return 1;
				} else {
					return o1.compareTo(o2);
				}
			}

		});

    	for(String s : asList) {
    		System.out.println(s);
    	}
    	
	}


}