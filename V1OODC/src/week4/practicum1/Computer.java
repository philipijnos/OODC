package week4.practicum1;
import java.time.LocalDate;

public class Computer implements Goed{
	private String type;
	private String macAdres;
	private double aanschafPrijs;
	private int productieJaar;
	
	public Computer(String tp, String adr, double pr, int jr){
		type = tp;
		macAdres = adr;
		aanschafPrijs = pr;
		productieJaar = jr;
	}
	public double huidigeWaarde(){
		return aanschafPrijs * Math.pow(0.6, (LocalDate.now().getYear()-productieJaar));
	}
	public boolean equals(Object input){
		boolean result = false;
		if(input instanceof Computer){
			Computer computerInput = (Computer) input;
			if (computerInput.type.equals(this.type) &&
				computerInput.macAdres.equals(this.macAdres) &&
				computerInput.aanschafPrijs == this.aanschafPrijs &&
				computerInput.productieJaar == this.productieJaar){
				
				result = true;
			}
		}
		return result;
	}
	public String toString(){
		String result = "Computer: "+type+" heeft een waarde van: €"+this.huidigeWaarde();
		return result;
	}
}