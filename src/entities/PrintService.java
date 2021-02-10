package entities;

import java.util.*;

public class PrintService<Type> {
	
	// a classe agora e generics possui <> e um argumento identificando o Tipo de object que ela pode assumir.
	
	private List<Type> list = new ArrayList<>();
	
	public void addValue(Type value) {
		list.add(value);
	}

	public void print() {
		System.out.print("[");
		
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i=1 ; i<list.size() ; i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

	public Type first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

}
