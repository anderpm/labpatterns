package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		//1
		/*
		Observable pacient = new Covid19Pacient("aitor", 35);
		PacientObserverGUI pacientGUI = new PacientObserverGUI(pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI((Covid19Pacient) pacient);
	
		Observable pacient1 = new Covid19Pacient("jon", 54);
		PacientObserverGUI pacient1GUI = new PacientObserverGUI(pacient1);
		PacientSymptomGUI frame1 = new PacientSymptomGUI((Covid19Pacient) pacient1);
		*/
		
		//2		
		/*
		Observable pacient2 = new Covid19Pacient("ane", 21);
		PacientObserverGUI pacient2GUI = new PacientObserverGUI(pacient2);
		PacientThermometerGUI pacient2TGUI = new PacientThermometerGUI(pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI((Covid19Pacient) pacient2);
		
		Observable pacient3 = new Covid19Pacient("mikel", 76);
		PacientObserverGUI pacient3GUI = new PacientObserverGUI(pacient3);
		PacientThermometerGUI pacient3TGUI = new PacientThermometerGUI(pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI((Covid19Pacient) pacient3);
		
		Observable pacient4 = new Covid19Pacient("Aitor", 35);
		PacientObserverGUI pacient4GUI = new PacientObserverGUI(pacient4);
		PacientThermometerGUI pacient4TGUI = new PacientThermometerGUI(pacient4);
		PacientSymptomGUI frame4 = new PacientSymptomGUI((Covid19Pacient) pacient4);
		*/

		//3
		
		Observable pacient5 = new Covid19Pacient("ander", 54);
		PacientObserverGUI pacient5GUI = new PacientObserverGUI(pacient5);
		PacientThermometerGUI pacient5TGUI = new PacientThermometerGUI(pacient5);
		SemaphorGUI pacient5SGUI = new SemaphorGUI(pacient5);
		PacientSymptomGUI frame5 = new PacientSymptomGUI((Covid19Pacient) pacient5);
		
	}

}