package fr.dauphine.ja.clauxaurelien.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Panel implements Iterable<Integer> {
	
	private ArrayList<Integer> list;
	
	public static void main (String[] args ) {
		Panel panel1 = new Panel(1,5);
		Iterator<Integer> it= panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
	}
	
	// faire une methode static en fait panel1
	
	public Iterator<Integer> iterator() {
		return list.iterator();
	}

	public Panel(int i,int j) {
		this.list = new ArrayList<Integer>();
		while (i < j) {
			i++;
			list.add(i);
		}
	
		
	}
}
