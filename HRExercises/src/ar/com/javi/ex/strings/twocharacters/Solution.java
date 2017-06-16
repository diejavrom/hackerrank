package ar.com.javi.ex.strings.twocharacters;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        Integer len = Integer.valueOf(in.next());
        String word = in.next();
        System.out.println(printMax(word, len));
    }

	private static int printMax(String word, Integer len) {
    	char[] charArray = word.toCharArray();
    	int[] array = IntStream.range(0, charArray.length).map(i -> charArray[i]).distinct().toArray();
    	int maxglobal = 0;
    	for(int i=0; i<array.length; i++) {
    		char x = new Character((char)array[i]);  
    		for(int j=i+1; j< array.length; j++) {
    			char y = new Character((char)array[j]);
        		boolean checkX = true;
        		int count = 0;
        		for(int k=0; k<charArray.length; k++) {
        			if(checkX) {
        				if(charArray[k] == x) {
        					checkX = false;
        					count++;
        				} else if(charArray[k] == y) {
        					count = 0;
        					break;
        				}
        			} else {
        				if(charArray[k] == y) {
        					checkX = true;
        					count++;
        				} else if(charArray[k] == x) {
        					count = 0;
        					break;
        				}
        			}
        		}
        		maxglobal = Math.max(maxglobal, count);
    		}
    	}
		return maxglobal;
	}

}