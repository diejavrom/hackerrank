package ar.com.javi.ex.strings.reducedstring;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
//        String result = super_reduced_using_stack(s);
        System.out.println(result);
    }

    static String super_reduced_string(String s) {
    	StringBuilder sb = new StringBuilder("");
    	int cant=0;
    	int from=-1;
    	for(int i=0; i<s.length(); i++) {
    		if(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
    			if(from == -1) {
    				from = i;
    			}
    			cant ++;
    		} else {
    			if(cant > 0) {
    				if(cant % 2 == 0) {
    					sb = sb.append(s.charAt(from));
    				}
    				from = -1;
    				cant = 0;
    			} else {
    				sb = sb.append(s.charAt(i));
    			}
    		}
    	}
    	if(sb.toString().length() == 0) {
    		return "Empty String";
    	} else if(sb.length() == s.length()) {
    		return s;
    	} else {
    		return super_reduced_string(sb.toString());
    	}
    }

    static String super_reduced_using_stack(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(int i=0; i<s.length(); i++) {
    		Character current = new Character(s.charAt(i));
			if(stack.isEmpty() || !current.equals(stack.peek())) {
    			stack.push(current);
    		} else {
    			stack.pop();
    		}
    	}
    	if(stack.isEmpty()) {
    		return "Empty String";
    	} else {
    		return stack.toString();
    	}
    }

}