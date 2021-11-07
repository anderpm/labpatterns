package observer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;
import observer.PacientThermometerGUI.TemperatureCanvas;


public class SemaphorGUI extends JFrame implements Observer{
	
	private TemperatureCanvas gauges;
	
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		gauges = new TemperatureCanvas(0,15);
		gauges.setSize(500,280);
		add("Center", gauges);		
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}

	
	class TemperatureCanvas extends Canvas {	
		
		public void set(int level) { current = level; }	
		public int get(){return current;}
		public int getMax(){return Max;}
		public int getMin(){return Min;}
		
		private int Max, Min, current;
		
		public TemperatureCanvas(int min, int max){ Min = min; Max = max; }
		
		public void paint(Graphics g)
		{	
			if (current<5) {
				setBackground(Color.green);
			}
			else if (current<10) {
				setBackground(Color.yellow);
		    }
			else {
				setBackground(Color.red);
			}
		}
		
	}

	
	@Override
	public void update(Observable o, Object arg) {
		Covid19Pacient p = (Covid19Pacient) o;
		//Obtain the current covidImpact to paint
		int impact = (int) p.covidImpact();	
		//temperature gauge update
		gauges.set(impact);
		gauges.repaint();		
	}
	
}     