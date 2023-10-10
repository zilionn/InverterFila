package view;

import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		int[] vet = {3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16};
		
		for(int valor : vet) {
			list.add(valor);
		}
		
		int esq = 0;
		int dir = list.size() - 1;
		
		while(esq < dir) {
			int aux = list.get(esq);
			list.set(esq, list.get(dir));
			list.set(dir, aux);
			
			esq++;
			dir--;
		}
		
		System.out.println("lista" + list);
		
	}

}
