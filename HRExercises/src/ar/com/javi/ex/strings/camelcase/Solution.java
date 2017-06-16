package ar.com.javi.ex.strings.camelcase;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Integer cant = countCamelCaseWords(s);
        System.out.println(cant);
    }

    static Integer countCamelCaseWords(String s) {
    	char[] charArray = s.toCharArray();
    	Integer count = IntStream.range(0, charArray.length).map(i -> Character.isUpperCase(charArray[i]) ? 1 : 0).reduce((x,y) -> x+y).getAsInt();
    	return count + 1;
    }

}