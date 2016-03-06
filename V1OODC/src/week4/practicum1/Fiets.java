package week4.practicum1;

import java.time.LocalDate;

public class Fiets extends Voertuig implements Goed{
	private int framenummer;
	
	public Fiets(String tp, double pr, int jr, int fnr){
		super(tp, pr, jr);
		framenummer = fnr;
	}
	public double huidigeWaarde(){
		return nieuwprijs * Math.pow(0.9, (LocalDate.now().getYear()-bouwjaar));
	}
	public boolean equals(Object input){
		boolean result = false;
		if(input instanceof Fiets){
			Fiets fietsInput = (Fiets) input;
			if (fietsInput.nieuwprijs == this.nieuwprijs &&
				fietsInput.bouwjaar == this.bouwjaar &&
				fietsInput.framenummer == this.framenummer){
				
				result = true;
			}
		}
		return result;
	}
}