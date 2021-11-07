package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndexSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int severity1 = ((Symptom)o1).getSeverityIndex();
		int severity2 = ((Symptom)o2).getSeverityIndex();
		
		if(severity1 < severity2) {
			return 1;
		} 
		else if(severity1 > severity2) {
			return -1;
		}else {
			return 0;
		}
	}

}
