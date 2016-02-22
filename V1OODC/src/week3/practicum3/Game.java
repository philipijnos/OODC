package week3.practicum3;
import java.text.DecimalFormat;
import java.time.*;

public class Game{
	private String naam;
	private int releaseJaar;
	private double nieuwprijs;
	
	public Game(String nm, int rJ, double nwpr){
		naam = nm;
		releaseJaar = rJ;
		nieuwprijs = nwpr;
	}
	public Game(){}
	public String getNaam(){
		return naam;
	}
	public double huidigeWaarde(){
		return nieuwprijs * Math.pow(0.7, (Year.now().getValue()-releaseJaar));
	}
	public boolean equals(Object input){
		boolean result = false;
		if(input instanceof Game){
			Game inputGame = (Game) input;
			if (this.naam.equals(inputGame.naam) &&
				this.releaseJaar == inputGame.releaseJaar &&
				this.nieuwprijs == inputGame.nieuwprijs){
				
				result = true;
			}
		}
		return result;
	}
	public String toString(){
		DecimalFormat df = new DecimalFormat("#.##");
		return "\t"+naam+", uitgegeven in "+releaseJaar+"; nieuwprijs: "+df.format(nieuwprijs)+" nu voor: €"+df.format(this.huidigeWaarde());
	}
}