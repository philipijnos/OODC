package week4.practicum1;
import java.util.*;
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
		return aanschafPrijs * Math.pow(0.40, (LocalDate.now().getYear()-productieJaar));
	}
	public boolean equals(Object input){
		boolean result = false;
		return result;
	}
}