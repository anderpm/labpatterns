package adapter;

import java.util.List;

import domain.Symptom;

public class CovidInvertedIteratorAdapter implements InvertedIterator {

	List<Symptom> sintomak;
	int i = 0;
	
	public CovidInvertedIteratorAdapter(List<Symptom> sintomak) {
		this.sintomak = sintomak;
	}
	
	@Override
	public Object previous() {
		Symptom s = sintomak.get(i);
		i--;
		return s;
	}

	@Override
	public boolean hasPrevious() {
		return i>-1;
	}

	@Override
	public void goLast() {
		this.i = this.sintomak.size() - 1;
	}

}
