package week4.practicum1;
import java.time.LocalDate;

public class Auto extends Voertuig{
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt){
		super(tp, pr, jr);
		kenteken = kt;
	}
	public double huidigeWaarde(){
		return nieuwprijs * Math.pow(0.7, (LocalDate.now().getYear()-bouwjaar));
	}
	public boolean equals(Object input){
		boolean result = false;
		if(input instanceof Auto){
			Auto autoInput = (Auto) input;
			if (autoInput.nieuwprijs == this.nieuwprijs &&
				autoInput.bouwjaar == this.bouwjaar &&
				autoInput.kenteken.equals(this.kenteken)){
				
				result = true;
			}
		}
		return result;
	}
}