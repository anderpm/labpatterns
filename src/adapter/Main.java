package adapter;

import java.util.ArrayList;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		
		Symptom s1 = new Symptom("s1", 10, 10);
		Symptom s2 = new Symptom("s2", 10, 11);
		Symptom s3 = new Symptom("s3", 10, 12);
		Symptom s4 = new Symptom("s4", 10, 13);
		Symptom s5 = new Symptom("s5", 10, 14);

		p.addSymptom(s1, 1);
		p.addSymptom(s2, 2);
		p.addSymptom(s3, 3);
		p.addSymptom(s4, 4);
		p.addSymptom(s5, 5);
		
		ArrayList<Symptom> list = new ArrayList<Symptom>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		CovidInvertedIteratorAdapter ciia = new CovidInvertedIteratorAdapter(list);
		SeverityIndexSort sis = new SeverityIndexSort();
		SymptomNameSort sns = new SymptomNameSort();
		Sorting s = new Sorting();
		
		//Sort by severity index
		System.out.println("Sort by severity index: ");
		Iterator i1 = s.sortedIterator(ciia, sis);
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		//Sort by symptom name
		System.out.println("Sort by symptom name: ");
		Iterator i2 = s.sortedIterator(ciia, sns);
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		

	}
	
}