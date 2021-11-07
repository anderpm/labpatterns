package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String name1 = ((Symptom)o1).getName();
		String name2 = ((Symptom)o2).getName();
		
		return name1.compareTo(name2);
	}

}
