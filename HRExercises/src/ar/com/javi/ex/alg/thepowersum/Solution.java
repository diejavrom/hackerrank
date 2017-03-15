package ar.com.javi.ex.alg.thepowersum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer X = Integer.valueOf(br.readLine());
			Integer N = Integer.valueOf(br.readLine());
			printThePowerSum(X, N);    
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static void printThePowerSum(Integer x, Integer n) {
		List<Integer> potencias = new ArrayList<>();
		Integer potActual = 1;
		while((int)Math.pow(potActual, n) <= x) {
			potencias.add((int)Math.pow(potActual, n));
			potActual ++;
		}
		List<List<Integer>> combinaciones = getCombinaciones(x, potencias);
		System.out.println(combinaciones.stream().filter(s -> s.stream().reduce(0, (z,y)-> z+y).equals(x)).count());
	}

	public static List<List<Integer>> infiltrar(Integer v, Integer e, List<List<Integer>> combinations) {
		if(combinations.isEmpty()) {
			combinations = new ArrayList<>();
			List<Integer> unique = new ArrayList<>();
			unique.add(e);
			combinations.add(unique);
		} else {
			List<List<Integer>> tmp = new ArrayList<>();
			for(List<Integer> c : combinations) {
				Integer sumaParcial = c.stream().reduce(0, (x,y) -> x+y);
				if(sumaParcial + e <= v) { //backtracking!
					List<Integer> cnew = new ArrayList<>(c);
					cnew.add(e);
					tmp.add(cnew);
				}
			}
			combinations.addAll(tmp);
			List<Integer> unique = new ArrayList<>();
			unique.add(e);
			combinations.add(unique);
		}
		return combinations;
	}
	
	public static List<List<Integer>> getCombinaciones(Integer v, List<Integer> potencias) {
		if(!potencias.isEmpty()) {
			Integer e = potencias.get(0);
			List<Integer> subList = potencias.subList(1, potencias.size());
			return infiltrar(v, e, getCombinaciones(v, subList));
		} else {
			return new ArrayList<>();
		}
	}

}